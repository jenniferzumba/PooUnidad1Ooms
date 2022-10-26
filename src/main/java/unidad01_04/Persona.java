/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad01_04;

/**
 *
 * @author jenniferzumba
 */
public class Persona {
    private String nombre;
    private int fechaNacimiento;
    
    
    public String mostrarInfo(){
        return this.nombre+" nacio en el years "+this.fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
