/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheque;

/**
 *
 * @author Usuario
 */
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Cheque(String nCliente, String nBanco, double vCheque) {
        nombreCliente = nCliente;
        nombreBanco = nBanco;
        valorCheque = vCheque;
    }

    public void establecerNombreC(String nCliente) {
        nombreCliente = nCliente;
    }

    public void establecerNombreB(String nBanco) {
        nombreBanco = nBanco;
    }

    public void establecerValorC(double vCheque) {
        valorCheque = vCheque;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public String obtenerNombreC() {
        return nombreCliente;
    }

    public String obtenerNombreB() {
        return nombreBanco;
    }

    public double obtenerValorC() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    public String toString() {
        String cadenaF = "";
        cadenaF = String.format("%sNombre de cliente: %s\nNombre del banco: %s\n"
                + "Valor de cheque: %.2f\nComision: %.2f", cadenaF, nombreCliente,
                nombreBanco, valorCheque, comision);
        return cadenaF;
    }
}
