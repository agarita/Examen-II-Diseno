/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0110.Caso1_Decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eadan
 */
public class FIStream implements InputStream{

    private FileInputStream stream;

    public FIStream(String filename) {
        try {
            stream=new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FIStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @Override
    public byte read() {
        try {
            return (byte) stream.read();
        } catch (IOException ex) {
            Logger.getLogger(FIStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
