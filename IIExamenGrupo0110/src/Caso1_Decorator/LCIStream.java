/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Decorator;

/**
 *
 * @author eadan
 */
public class LCIStream extends Decorator {

    public LCIStream(InputStream stream) {
        super(stream);
    }

    @Override
    public byte read() {
        byte c = super.read();
        return (byte) Character.toLowerCase(c);
    }  
    
}
