/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Calificacion {
    private double promedio;
    private double notaFinal;
    private Estudiante persona;
    private Asignatura materia;

    public Calificacion(double promedio, double notaFinal, Estudiante persona, Asignatura ma) {
        this.promedio = promedio;
        this.notaFinal = notaFinal;
        this.persona = persona;
        this.materia = ma;
    }
    public String mostrarInfo(){
        return"El estudiante"+this.persona.getNombre()+
                " tiene un promedio de "+this.getPromedio()+
                " en la mitad de la materia de "+this.materia.getNombreAsig()+
                " por lo que en total de todos sus resultados la nota final es de"+this.getNotaFinal();
    }

    public double getPromedio() {
        return promedio;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public Estudiante getPersona() {
        return persona;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setPersona(Estudiante persona) {
        this.persona = persona;
    }

    public void setNota(Asignatura materia) {
        this.materia = materia;
    }
    
    
    
}
