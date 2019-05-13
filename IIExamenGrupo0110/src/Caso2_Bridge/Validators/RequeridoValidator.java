/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Bridge.Validators;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eadan
 */
public class RequeridoValidator implements Validator<Object>{

    public RequeridoValidator() {
    }

    @Override
    public List validate(Object info) {
        ArrayList<String> res = new ArrayList<String>();
        if (info instanceof String&&((String)info).equals("")){
            res.add("Cadena vacia recibida");
        }else if (info==null){
            res.add("Campo vacio recibido");
        }
        return res;
    }
    
}
