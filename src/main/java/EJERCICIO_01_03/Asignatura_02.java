/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Asignatura_02 {
    private double costoHora;
    private String nombreasig;
    private Carrera ciclo;
    

    public Asignatura_02(double costoHora, String nombre, Carrera ciclo) {
        this.costoHora = costoHora;
        this.nombreasig = nombre;
        this.ciclo = ciclo;
    }
    public String mostrarInfo(){
        return" la asignatura de "+this.getNombreAsig()+
                " del "+this.ciclo.getSemestre()+ 
                " ciclo lo cual el costo de cada hora es de "+this.getCostoHora();
    }

    public double getCostoHora() {
        return costoHora;
    }

    public String getNombreAsig() {
        return nombreasig;
    }

    public Carrera getCiclo() {
        return ciclo;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    public void setNombre(String nombre) {
        this.nombreasig = nombre;
    }

    public void setEstudiante(Carrera ciclo) {
        this.ciclo = ciclo;
    }
    
    
    
}
