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
public class Decorator implements InputStream {
    private InputStream stream;

    public Decorator(InputStream stream) {
        this.stream = stream;
    }

    @Override
    public byte read() {
        return stream.read();
    }
    
    
}
