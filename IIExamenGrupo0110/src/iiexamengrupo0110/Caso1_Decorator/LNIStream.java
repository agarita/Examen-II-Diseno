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
public class LNIStream extends Decorator {
    private int lines;

    public LNIStream(InputStream stream) {
        super(stream);
    }

    @Override
    public byte read() {
        byte c = super.read();
        if (c=='\n')
            lines++;
        return c;
    }
    
    
    
    public int getLineNumber(){
        return lines;
    }
    
}
