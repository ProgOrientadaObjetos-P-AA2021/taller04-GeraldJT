/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

/**
 *
 * @author Usuario
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoTotal;
    private double sueldoBasico;
    private int cedula;

    public Profesor(String n, String a, double s, int c) {
        nombre = n;
        apellido = a;
        sueldoBasico = s;
        cedula = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerSueldoB(double s) {
        sueldoBasico = s;
    }

    public void calcularSueldoT() {
        double total = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + total;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoB() {
        return sueldoBasico;
    }

    public double obtenerSueldoT() {
        return sueldoTotal;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String toString() {
        String cadenaF = "";
        cadenaF = String.format("%sNombre: %s\nApellido: %s\nCedula: %d\n"
                + "Sueldo basico: %.2f\nSueldo total: %.2f", cadenaF, nombre,
                apellido, cedula, sueldoBasico, sueldoTotal);
        return cadenaF;
    }
}
