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
public class EsNumValidator implements Validator<String>{

    public EsNumValidator() {
    }
    @Override
    public List validate(String info) {
        ArrayList<String> res = new ArrayList<String>();
        if(info=="")
            res.add("Cadena vacia recibida");
        else {
            try {
                int i = Integer.parseInt((String) info);
            } catch (NumberFormatException | NullPointerException nfe) {
                res.add("Numero en formato desconocido");
            }
        }
        
        return res;
    }
}
