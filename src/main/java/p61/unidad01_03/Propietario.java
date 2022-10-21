/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

/**
 *
 * @author jenniferzumba
 */
public class Propietario {
    String nombre;
    String telefono;
    String direccion;
    int yearNacimiento;
    
    public String mostrarInfo(){
        return "el  propietario se llama "+this.nombre+
                " su numero de telefono es "+this.telefono+"vive en la direccion"+this.direccion+
                " y tiene "+this.yearNacimiento+"years";
    }
    public int calcularEdad(int yearActual){
        return yearActual-this.yearNacimiento;
    }
    
    
}
