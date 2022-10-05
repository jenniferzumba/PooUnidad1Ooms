/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poounidad1ooms;

/**
 *
 * @author jenniferzumba
 */
public class PooUnidad1Ooms {

    public static void main(String[] args) {
        System.out.println("Clase01_01_02");
        
        var perro1=new Perro();
        var perro2=new Perro();
        var perro3=new Perro();
        
        perro1.nombre="Firulais";
        perro1.raza="Mestizo";
        perro1.edad=5;
        
        perro2.nombre="pepe";
        perro2.raza="negro";
        perro2.edad=3;
        
        var persona1=new Persona();
        var persona2=new Persona();
        var persona3=new Persona();
        
        persona1.nombre="Ana";
        persona1.edad=21;
        persona1.cedula=0350150;
        
        var auto1=new Auto();
        var auto2=new Auto();
        var auto3=new Auto();
        
        auto1.año=2018;
        auto1.marca="toyota";
        auto1.placa="X1G3G2";
        
        var computador1=new Computador();
        var computador2=new Computador();
        var computador3=new Computador();
        
        computador1.capacidad=45;
        computador1.marca="LG";
        computador1.modelo="HP";
        
        System.out.println(" Mi perro se llama "+perro1.nombre+ " tiene " +perro1.edad+" años " + " y es un " +perro1.raza);
        System.out.println(" Mi perro se llama "+perro2.nombre+" tiene "+perro2.edad+ " años "+"y es un "+perro2.raza);
        System.out.println();
        
        
        
    }
}
