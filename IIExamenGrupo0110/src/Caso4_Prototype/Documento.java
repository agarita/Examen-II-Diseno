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
public abstract class Documento {
    public String proveedor;
    public boolean firmaRRHH;
    public boolean firmaVendedor;

    public Documento() {
    }
    
    public abstract Documento copiar();
    
    public boolean aprobado(){
        if(firmaRRHH && firmaVendedor)
            return true;
        return false;
    } 
    
    public void firmarRRHH(){
        System.out.println("El documento ha sido firmado por el empleado de RRHH...");
        this.firmaRRHH = true;
    }
    
    public void firmarVendedor(){
        System.out.println("El documento ha sido firmado por el vendedor...");
        this.firmaVendedor = true;
    }
}