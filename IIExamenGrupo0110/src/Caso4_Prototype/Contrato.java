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
public class Contrato extends Documento{
    
    public Contrato() {
    }
    
    @Override
    public Documento copiar() {
        return new Contrato();
    }
}
