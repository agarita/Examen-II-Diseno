/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2_Bridge.Validators;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eadan
 */
public class MayorDeEdadValidator implements Validator<Date>{

    public MayorDeEdadValidator() {
    }
    
    
    @Override
    public List validate(Date info) {
        ArrayList<String> res = new ArrayList<String>();
        Calendar c = Calendar.getInstance();
        c.setTime(info);
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE)), now);
        if(diff.getYears()<18)
            res.add("Debe ser mayor de edad");
        return res;
    }
}
