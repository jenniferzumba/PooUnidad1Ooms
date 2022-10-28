/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Carrera {
    private int semestre;
    private String nombreCarrera;
    private double costoSemestre;
    private Universidad universidad;

    public Carrera(int semestre, String nombreCarrera, double costoSemestre, Universidad uni) {
        this.semestre = semestre;
        this.nombreCarrera = nombreCarrera;
        this.costoSemestre = costoSemestre;
        this.universidad = uni;
    }
    public String mostrarInfo(){
        return "En la universidad de "+this.universidad.getNombre()+" se ofrece carreras con  : "+this.semestre+
            " semestre  la carrera  mas demandada es : "+this.nombreCarrera+
            " y el costo del semestre es : "+this.costoSemestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void setCostoSemestre(double costoSemestre) {
        this.costoSemestre = costoSemestre;
    }

    public void setPersonal(Universidad uni) {
        this.universidad = uni;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public double getCostoSemestre() {
        return costoSemestre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }
    
    
}
