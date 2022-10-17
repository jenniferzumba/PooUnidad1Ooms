/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02;

/**
 *
 * @author jenniferzumba
 */
public class Empleado {

    String nombre;
    int horasTrabajada;
    double costoHora;
    int yearingreso;

    public double calcularIngreso(int yearActual) {
        var year = yearActual - this.yearingreso;
        var retorno = (this.costoHora * this.horasTrabajada) + (year * 0.02 * (this.horasTrabajada * this.costoHora));

        return retorno;
    }

    public double calcularBonoHorasExtra() {
        var retorno = 0.0d;
        var hora = this.horasTrabajada;
        if (hora > 160) {
            retorno = hora - 160;
            retorno = (retorno * this.costoHora * 2);
        }

        return retorno;
    }

    public double calcularImpuesto(int limite1, int limite2, int limite3) {
        var retorno = 0.0d;
        var basico = this.costoHora * this.horasTrabajada;
        if (basico > limite1 && basico < limite2) {
            retorno = basico * 0.05;
        } 
        else {
            if (basico > limite2 && basico < limite3) {
                retorno = basico * 0.12;

            }
            else {
                if (basico > limite3) {
                    retorno = basico * 0.25;
                }

            }

        }

        return retorno;
    }

    public double calcularTotal(int limite1, int limite2, int limite3, int yearActual) {
        var retorno = this.calcularBonoHorasExtra() + this.calcularIngreso(yearActual) - this.calcularImpuesto(limite1, limite2, limite3);

        return retorno;
    }

}
