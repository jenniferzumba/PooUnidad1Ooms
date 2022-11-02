/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02_11_2022;

/**
 *
 * @author jenniferzumba
 */
public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private Owner owner;

    public Mascota(String nombre, String raza, int edad ,Owner owner) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.owner=owner;
    }
    public String mostarInfo(){
        return  this.owner.getNombre()+" tiene un perro de raza "
                +this.getRaza()+" que tiene una edad de "+this.getEdad()+
                " years y su nombre es "+this.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
}
