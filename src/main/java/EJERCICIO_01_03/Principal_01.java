/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Principal_01 {
    public static void main(String[] args) {
        
        var propietario=new Propietario("Juan Perez"," avenida de las americas",1987);
        var propietario2=new Propietario("Maria Andrade"," gran colombia",1967);
        
        var auto=new Auto("negro","Toyota",2018,1200.50,"XHAGAG3");
        var auto2=new Auto("blanco","chevrolet",2015,10090,"AHHAA88");
        
        
        var matricula=new Matricula("Azuay","Cuenca",auto,propietario);
        var matricula2=new Matricula("Guayas","Guallaquil",auto2,propietario2);
        
        
        
        System.out.println(propietario.mostrarInfo());
        System.out.println(propietario2.mostrarInfo());
        System.out.println(auto.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
        System.out.println(matricula.mostrarInfo());
        System.out.println(matricula2.mostrarInfo());
        
        
        
        
        
        
    }
}
