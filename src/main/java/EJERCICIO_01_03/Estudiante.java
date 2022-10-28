/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String cedula;
    private String direccion;

    public Estudiante(String nombre, int edad, String cedula, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    
    public String mostrarInfo(){
        return "El estudiante "+this.getNombre()+
                " de "+this.getEdad()+"years con numero de cedula"
                +this.getCedula()+" y viven en "+this.getDireccion();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
