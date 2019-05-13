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
public class Caso4_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoRRHH emp = new EmpleadoRRHH();
        Vendedor ven =  new Vendedor("Alejandro", "Garita");
        
        Contrato con = emp.getContrato();
        NDA nda = emp.getNDA();
        
        emp.firmar(con);
        emp.firmar(nda);
        if(!con.aprobado())
            System.out.println("El documento no ha sido aprobado");
        ven.firmar(con);
        ven.firmar(nda);
        if(con.aprobado())
            System.out.println("El documento ha sido aprobado");
    }
}
