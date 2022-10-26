/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad01_04;

/**
 *
 * @author jenniferzumba
 */
public class Tecnico extends Persona{
   
    private int yearContrato;
    private Seleccion equipo;
    
    
    
    public String mostarInfoTecnico(){
        return this.mostrarInfo()+"El director tecnico "+this.getNombre()+
                " nacido en el year "+this.getFechaNacimiento()+
                " con "+this.yearContrato+" years de expreriencia "
                + "que actualmente dirige al equipo de "+this.equipo.getNombre();
    }

    

    public void setYearContrato(int yearContrato) {
        this.yearContrato = yearContrato;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

   
}
