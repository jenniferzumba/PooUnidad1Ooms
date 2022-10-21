/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;
import p61.unidad01_03.*;
/**
 *
 * @author jenniferzumba
 */
public class Principal {
    public static void main(String[] args) {
        
        var propietario1=new Propietario();
        propietario1.nombre=" Juan perez";
        propietario1.direccion=" paris y oslo";
        propietario1.telefono=" 0959231416";
        propietario1.yearNacimiento=1989;
        
        
        var propietario2=new Propietario();
        propietario2.nombre=" Julia perez";
        propietario2.direccion=" colombia y sagurima";
        propietario2.telefono=" 0959231322";
        propietario2.yearNacimiento=1456;
        
         var lugar =new LugarMatriculacion();
        lugar.cuidad=" Cuenca";
        lugar.provincia="Azuay";
        lugar.descripcion="CAMIONETA";
        lugar.telefono="0957252424";
        
        var lugar2 =new LugarMatriculacion();
        lugar2.cuidad="loja";
        lugar2.provincia="loja ";
        lugar2.descripcion="BUS";
        lugar2.telefono="0973647656";
        
        var auto=new Auto();
        auto.color="Amarillo";
        auto.cilindraje=180;
        auto.marca="toyota";
        auto.placa="CAGH56F";
        auto.precio=1234;
        auto.year=2018;
        auto.owner=propietario2;
        auto.matricula=lugar;
        
        var auto2=new Auto();
        auto2.color="Azul";
        auto2.cilindraje=180;
        auto2.marca="ferrari ";
        auto2.placa="JAHGVA";
        auto2.precio=1800;
        auto2.year=2010;
        auto2.owner=propietario1;
        auto2.matricula=lugar2;
       
        
        
        
        System.out.println(auto.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
        
        
    }
        
   
    
}
