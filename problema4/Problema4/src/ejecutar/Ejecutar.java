/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import cheque.Cheque;

/**
 *
 * @author Usuario
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreCliente = "Gerald";
        String nombreBanco = "Banco de Pichincha";
        double valorCheque = 1000000;
        Cheque cheque = new Cheque(nombreCliente, nombreBanco, valorCheque);
        cheque.calcularComision();
        System.out.printf("%s\n", cheque);
        
    }
    
}
