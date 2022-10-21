/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

/**
 *
 * @author jenniferzumba
 */
public class LugarMatriculacion {
    
    String provincia;
    String cuidad;
    String descripcion;
    String telefono;
    
    public String mostrarInfo(){
        return "la discripcion de la matricula es "+this.descripcion+ " el telefono es "+this.telefono+" se puede matricular en la provincia de "+this.provincia+" en la ciudad"+this.cuidad;
    }
    
    
}
