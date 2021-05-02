/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author jamil
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    private int cedulaD;
    private String marcaV;
    private int aFabricante;
    private double valorV;
    private double valorM;

    public Vehiculo(int cedula, String mV, int aF, double vV) {
        cedulaD = cedula;
        marcaV  = mV;
        aFabricante = aF;
        valorV = vV;
    }

    public void establecerCedulaDueño(int c) {
        cedulaD = c;
    }

    public void establecerMarcaVehiculo(String m) {
        marcaV = m;
    }

    public void establecerAñoFabricante(int aF) {
        aFabricante = aF;
    }

    public void establecerValorVehiculo(double vH) {
        valorV = vH;
    }

    public void establecerValorMatricula() {
        valorM = (valorV * 0.002 )/100;
    }

    public int obtenerCedulaDueño() {
        return cedulaD;
    }

    public String obtenererMarcaVehiculo() {
        return marcaV;
    }

    public int obtenerFabricante() {
        return aFabricante;
    }

    public double obtenerValorVehiculo() {
        return valorV;
    }

    public double obtenerValorMatricula() {
        return valorM;
    }

    public String toString() {
        return "Cedula Dueño:" + cedulaD + "\nMarca Vehiculo:"
                + marcaV + "\nAño Fabricantes:"
                + aFabricante + "\nValor Vehiculo:"
                + valorV + "\nValor Matricula:"
                + valorM + "\n";

    }
}
