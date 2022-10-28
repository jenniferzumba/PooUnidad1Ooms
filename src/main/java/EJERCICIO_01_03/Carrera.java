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
    private Universidad Personal;

    public Carrera(int semestre, String nombreCarrera, double costoSemestre, Universidad Personal) {
        this.semestre = semestre;
        this.nombreCarrera = nombreCarrera;
        this.costoSemestre = costoSemestre;
        this.Personal = Personal;
    }
    public String mostrarInfo(){
        return "Esta en el semestre : "+this.semestre+
            "el nombre de la carrera es : "+this.nombreCarrera+
            "el costo del semestre es : "+this.costoSemestre;
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

    public void setPersonal(Universidad Personal) {
        this.Personal = Personal;
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

    public Universidad getPersonal() {
        return Personal;
    }
    
    
}
