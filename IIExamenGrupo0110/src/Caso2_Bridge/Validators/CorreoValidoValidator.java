/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Bridge.Validators;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author eadan
 */
public class CorreoValidoValidator implements Validator<String> {
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public CorreoValidoValidator() {
    }
    
    
    @Override
    public List validate(String info) {
        ArrayList<String> res = new ArrayList<String>();
        if(info=="")
            res.add("Cadena vacia recibida");
        else {
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher((CharSequence) info);
            if(!matcher.find())
                res.add("Email invalido");
        }
        
        // Aqui deberia haber una coneccion a la base donde revisamos si el email
        // ya ha sido utilizado.
        
        return res;
    }
}
