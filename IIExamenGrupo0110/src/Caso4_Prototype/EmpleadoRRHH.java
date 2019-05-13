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
public class EmpleadoRRHH {
    private final Contrato con = new Contrato();
    private final NDA nda = new NDA();
    
    public EmpleadoRRHH() {
    }
    
    public Contrato getContrato(){
        return (Contrato) con.copiar();
    }
    public NDA getNDA(){
        return (NDA) nda.copiar();
    }
    
    public void firmar(Documento doc){
        doc.firmarRRHH();
    }
}
