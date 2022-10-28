/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Asignatura {
    private String nombreAsig;
    private String docente;
    private int horasAsig;

    public Asignatura(String nombreAsig, String docente, int horasAsig) {
        this.nombreAsig = nombreAsig;
        this.docente = docente;
        this.horasAsig = horasAsig;
    }
    public String mostrarInfo(){
        return" La materia de "+this.getNombreAsig()+
                " lo da el docente "+this.getDocente()+
                " y lo da "+this.getHorasAsig()+
                " horas a la semana";
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public void setHorasAsig(int horasAsig) {
        this.horasAsig = horasAsig;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public String getDocente() {
        return docente;
    }

    public int getHorasAsig() {
        return horasAsig;
    }
    
    
    
    
}
