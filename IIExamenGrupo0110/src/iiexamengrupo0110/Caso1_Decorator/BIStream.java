/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0110.Caso1_Decorator;

/**
 *
 * @author eadan
 */
public class BIStream extends Decorator{
    String buffer;

    public BIStream(InputStream stream) {
        super(stream);
    }
    
    String readLine(){
        buffer="";
        byte c;
        do{
            c = read();
            buffer+=(char) c;
        }while(c!='\n');
        return buffer;
      
    }
    
    
}
