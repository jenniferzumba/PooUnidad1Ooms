/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad01_04;

/**
 *
 * @author jenniferzumba
 */
public class Tecnico {
    String nombre;
    int fechaNacimiento;
    int yearContrato;
    Seleccion equipo;
    
    
    
    public String mostarInfo(){
        return"El director tecnico "+this.nombre+
                " nacido en el year "+this.fechaNacimiento+
                " con "+this.yearContrato+" years de expreriencia "
                + "que actualmente dirige al equipo de "+this.equipo.nombre;
    }
    
}
