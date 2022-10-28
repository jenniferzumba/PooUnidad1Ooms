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
    
    private double notaFinal;
    private Estudiante persona;
    private Asignatura materia;

    public Calificacion(double notaFinal, Estudiante persona, Asignatura ma) {
        
        this.notaFinal = notaFinal;
        this.persona = persona;
        this.materia = ma;
    }
    public String mostrarInfo(){
        return"El estudiante"+this.persona.getNombre()+
                " en la materia de "+this.materia.getNombreAsig()+
                " tiene como   nota final "+this.getNotaFinal();
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
