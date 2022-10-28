/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Auto {
    private String color;
    private String modelo;
    private int year;
    private double precio;
    private String placa;

    public Auto(String color, String modelo, int year, double precio,String pl) {
        this.color = color;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.placa=pl;
    }
    
 
    public String mostrarInfo(){
        return " El auto "+this.getModelo()+ " de color "
                +this.getColor()+" del years "+this.getYear()+
                " con su respectiva placa "+this.getPlaca()+
                " con un precio de "+this.getPrecio()+" dolares";
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
