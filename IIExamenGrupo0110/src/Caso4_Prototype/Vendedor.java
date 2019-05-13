/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_Prototype;

/**
 *
 * @author luisg
 */
public class Vendedor {
    public String nombre;
    public String apellido;

    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void firmar(Documento doc){
        doc.firmarVendedor();
    }
}
