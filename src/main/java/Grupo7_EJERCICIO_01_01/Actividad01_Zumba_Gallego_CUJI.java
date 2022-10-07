/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Grupo7_EJERCICIO_01_01;

/**
 *
 * @author jenniferzumba
 */
public class Actividad01_Zumba_Gallego_CUJI {

    public static void main(String[] args) {
        System.out.println("Actividad01_JenniferZumba_TatianaGallego");
        
        var animal1=new AnimalesVertebrados();
        animal1.especie="mamifero";
        animal1.nombre="vaca";
        animal1.peso=720;
        animal1.tamaño=1.5;
        var animal2=new AnimalesVertebrados();
        animal2.especie="reptil";
        animal2.nombre="lagartija";
        animal2.peso=4;
        animal2.tamaño=30;
        var animal3=new AnimalesVertebrados();
        animal3.especie="anfibios";
        animal3.nombre="sapo";
        animal3.peso=25;
        animal3.tamaño=1.5;
        System.out.println(" La "+animal1.nombre+" es un animal de la especie "+animal1.especie+" y su peso aproximadamente es de "+animal1.peso+" kg con un tamaño de "+animal1.tamaño+" metros");
        System.out.println(" La "+animal2.nombre+" es un animal de la especie "+animal2.especie+" y su peso aproximadamente es de "+animal2.peso+" kg con un tamaño de "+animal2.tamaño+" cm");
        System.out.println(" La "+animal3.nombre+" es un animal de la especie "+animal3.especie+" y su peso aproximadamente es de "+animal3.peso+" kg con un tamaño de "+animal3.tamaño+" cm");
        
        var arbol1=new Arbol();
        arbol1.nombre="eucalito";
        arbol1.tipo=" mirtaceas";
        arbol1.altura=13;
        arbol1.año=200;
        var arbol2=new Arbol();
        arbol2.nombre="manzano";
        arbol2.tipo="frutales";
        arbol2.altura=6;
        arbol2.año=150;
        var arbol3=new Arbol();
        arbol3.nombre="pino";
        arbol3.tipo="pinus";
        arbol3.altura=25;
        arbol3.año=250;
        System.out.println(" El "+arbol1.nombre+" es un arbol de la especie "+arbol1.tipo+" llegan medir aproximadamnete "+arbol1.altura+" metros y llega a tener una larga vida de  "+arbol1.año+" aproximadamente ");
        System.out.println(" El "+arbol2.nombre+" es un arbol de la especie "+arbol2.tipo+" llegan medir aproximadamnete "+arbol2.altura+" metros y llega a tener una larga vida de  "+arbol2.año+" aproximadamente ");
        System.out.println(" El "+arbol3.nombre+" es un arbol de la especie "+arbol3.tipo+" llegan medir aproximadamnete "+arbol3.altura+" metros y llega a tener una larga vida de  "+arbol3.año+" aproximadamente ");
        
        
        var avion1=new Avion();
        avion1.año=1999;
        avion1.marca="Airbus A320";
        avion1.capacidad=600;
        avion1.tamaño=70;
        var avion2=new Avion();
        avion2.año=2000;
        avion2.marca="Boeing 737";
        avion2.capacidad=550;
        avion2.tamaño=75;
        var avion3=new Avion();
        avion3.año=2010;
        avion3.marca="Lockheed Martin";
        avion3.capacidad=500; 
        avion3.tamaño=73;
        System.out.println(" El avion de la marca "+avion1.marca+" fue creado en el año "+avion1.año+" la cual tiene una capacidad de "+avion1.capacidad+" de personas con un tamaño aproximado de "+avion1.tamaño+" metros");
        System.out.println(" El avion de la marca "+avion2.marca+" fue creado en el año "+avion2.año+" la cual tiene una capacidad de "+avion2.capacidad+" de personas con un tamaño aproximado de "+avion2.tamaño+" metros");
        System.out.println(" El avion de la marca "+avion3.marca+" fue creado en el año "+avion3.año+" la cual tiene una capacidad de "+avion3.capacidad+" de personas con un tamaño aproximado de "+avion3.tamaño+" metros");
        
        var celular1=new CelularMovil();
        celular1.marca="iphone";
        celular1.modelo="14promax";
        celular1.capacidad=128;  
        celular1.color="negro";
        var celular2=new CelularMovil();
        celular2.marca="samsung";
        celular2.modelo="A51";
        celular2.capacidad=128; 
        celular2.color="rosado";
        var celular3=new CelularMovil();
        celular3.marca="iphone";
        celular3.modelo="12promax";
        celular3.capacidad=128;
        celular3.color="azul";
        System.out.println(" El "+celular1.marca+celular1.modelo+"de color "+celular1.color+" tiene una capcidad de almacenamiento de "+celular1.capacidad+"GB");
        System.out.println(" El "+celular2.marca+celular2.modelo+"de color "+celular2.color+" tiene una capcidad de almacenamiento de "+celular2.capacidad+"GB");
        System.out.println(" El "+celular3.marca+celular3.modelo+"de color "+celular3.color+" tiene una capcidad de almacenamiento de "+celular3.capacidad+"GB");
        
        var ventana1=new Ventana();
        ventana1.color="blanco";
        ventana1.diseño="cuadrado";
        ventana1.tamaño=2;
        ventana1.grosor=3;
        var ventana2=new Ventana();
        ventana2.color="negro";
        ventana2.diseño="redondo";
        ventana2.tamaño=2;
        ventana2.grosor=2;
        var ventana3=new Ventana();
        ventana3.color="cafe";
        ventana3.diseño="triangular";
        ventana3.tamaño=2;
        ventana3.grosor=4;
        System.out.println(" La ventana "+ventana1.diseño+" tiene un tamaño de  "+ventana1.tamaño+" metros cuadrados con un color "+ventana1.color+" con un grosor de "+ventana1.grosor+"cm");
        System.out.println(" La ventana "+ventana2.diseño+" tiene un tamaño de  "+ventana2.tamaño+" metros cuadrados con un color "+ventana2.color+" con un grosor de "+ventana2.grosor+"cm");
        System.out.println(" La ventana "+ventana3.diseño+" tiene un tamaño de  "+ventana3.tamaño+" metros cuadrados con un color "+ventana3.color+" con un grosor de "+ventana3.grosor+"cm");
        
        var vestuario1=new Vestuario();
        vestuario1.marca="Guchi";
        vestuario1.prenda="sueter";
        vestuario1.talla=35;
        vestuario1.precio=130;
        var vestuario2=new Vestuario();
        vestuario2.marca="valenciaga";
        vestuario2.prenda="camiza";
        vestuario2.talla=34;
        vestuario2.precio=100;
        var vestuario3=new Vestuario();
        vestuario3.marca="shein";
        vestuario3.prenda="pantalon";
        vestuario3.talla=20;
        vestuario3.precio=45;
        
        System.out.println(" La marca "+vestuario1.marca+" ofrece un "+vestuario1.prenda+" de la talla "+vestuario1.talla+" por el precio de "+vestuario1.precio+" dolares");
        System.out.println(" La marca "+vestuario2.marca+" ofrece un "+vestuario2.prenda+" de la talla "+vestuario2.talla+" por el precio de "+vestuario2.precio+" dolares");
        System.out.println(" La marca "+vestuario3.marca+" ofrece un "+vestuario3.prenda+" de la talla "+vestuario3.talla+" por el precio de "+vestuario3.precio+" dolares");
        
        
        
        
        
       
        
       
        

    }
}
