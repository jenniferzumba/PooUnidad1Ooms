/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02_11_2022;

/**
 *
 * @author jenniferzumba
 */
public class Owner {
    private String nombre;
    private String direccion ;
    private int fechaNacimiento;
    

    public Owner(String nombre, String direccion, int fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String mostarInfo(){
        return this.getNombre()+ " nacio en el year de  "
                +this.getFechaNacimiento()+" y vive en "+this.getDireccion();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
