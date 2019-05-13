/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Bridge;

import Caso2_Bridge.Validators.CorreoValidoValidator;
import Caso2_Bridge.Validators.EsNumValidator;
import Caso2_Bridge.Validators.MayorDeEdadValidator;
import Caso2_Bridge.Validators.RequeridoValidator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eadan
 */
public class FormularioRegistro {
    RequeridoValidator requeridoValidator;
    EsNumValidator numValidator;
    CorreoValidoValidator correoValidator;
    MayorDeEdadValidator edadValidator;

    String nombre;
    String apellido1;
    String apellido2;
    String correoElectronico;
    String movil;
    String direccionFisica;
    String diaDeNacimiento;
    String mesDeNacimiento;
    String annoDeNacimiento;
    
    
    public FormularioRegistro() {
        this.requeridoValidator = new RequeridoValidator();
        this.numValidator = new EsNumValidator();
        this.correoValidator = new CorreoValidoValidator();
        this.edadValidator = new MayorDeEdadValidator();
    }
    
    public List validate(){
        ArrayList<String> res=new ArrayList<>();
        try {
            res.addAll(requeridoValidator.validate(nombre));
            res.addAll(requeridoValidator.validate(apellido1));
            res.addAll(requeridoValidator.validate(apellido2));
            res.addAll(requeridoValidator.validate(correoElectronico));
            res.addAll(correoValidator.validate(correoElectronico));
            res.addAll(requeridoValidator.validate(movil));
            res.addAll(numValidator.validate(movil));
            res.addAll(requeridoValidator.validate(direccionFisica));
            res.addAll(requeridoValidator.validate(diaDeNacimiento));
            res.addAll(numValidator.validate(diaDeNacimiento));
            res.addAll(requeridoValidator.validate(mesDeNacimiento));
            res.addAll(numValidator.validate(mesDeNacimiento));
            res.addAll(requeridoValidator.validate(annoDeNacimiento));
            res.addAll(numValidator.validate(annoDeNacimiento));
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            res.addAll(edadValidator.validate(format.parse ( annoDeNacimiento+"-"+mesDeNacimiento+"-"+diaDeNacimiento)));
        } catch (ParseException ex) {
            Logger.getLogger(FormularioRegistro.class.getName()).log(Level.SEVERE, null, ex);
            // Esto deberia pasarse a otro validator, pero deberia recibir los tres parametros
            // o ser 3 validators por separado (diaValidator, mesValidator, annoValidator)
            // No se realiza por simplicidad.
        }
        return res;
    }
    
    
    
    
}
