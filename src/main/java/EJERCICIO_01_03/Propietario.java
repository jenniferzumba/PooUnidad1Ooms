/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Propietario {
    private String nombre;
    private String direccion;
    private int yearNacimiento;
    

    public Propietario(String nombre, String direccion, int yearNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.yearNacimiento = yearNacimiento;
    }
    
    public String mostrarInfo(){
        return this.getNombre()+ " vive en la direccion  "
                +this.getDireccion()+" nacido en el año de  "+this.getYearNacimiento(); 
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }
    
    
}
