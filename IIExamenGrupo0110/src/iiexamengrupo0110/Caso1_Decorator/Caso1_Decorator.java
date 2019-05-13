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
public class Caso1_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se inicializa el stream
        InputStream fistream=new FIStream("src/iiexamengrupo0110/caso1_decorator/test.txt");
        
        // Puedo leer bytes
        for (int i = 0; i < 4; i++) {
            System.out.print((char)fistream.read()); // Se convierte a char xq es byte
            
        }
        
        // Ahora puedo contar lineas 
        fistream=new LNIStream(fistream);
        for (int i = 0; i < 6; i++) { // 5 Por el cambio de linea
            System.out.print((char)fistream.read()); // Se convierte a char xq es byte
            
        }
        System.out.println("\t lineas: "+((LNIStream)fistream).getLineNumber());
        
        
        // Ahora puedo leer lineas
        fistream=new BIStream(fistream);
        System.out.print(((BIStream)fistream).readLine());

        // Ahora convierto lo que leo a minuscula
        fistream=new LCIStream(fistream);
        for (int i = 0; i < 5; i++) { // 5 Por el cambio de linea
            System.out.print((char)fistream.read()); // Se convierte a char xq es byte
            
        }
        
    }
    
}
