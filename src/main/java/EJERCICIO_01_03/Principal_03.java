/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Principal_03 {
    public static void main(String[] args) {
        
        var universidad=new Universidad("Mario Rizini",1967,40,"Universidad Politecnica Salesiana");
        var universidad2=new Universidad("Gullermo Mensi",1967,35,"Universidad Politecnica Salesiana");
        
        var carrera =new Carrera(8,"computacion",1970.50,universidad);
        var carrera2 =new Carrera(6,"computacion",1780.49,universidad2);
        
        var asignatura=new Asignatura_02(3.10,"calculo",carrera);
        var asignatura2=new Asignatura_02(3.10,"programacion",carrera2);
        
        System.out.println(universidad.mostrarInfo());
        System.out.println(universidad2.mostrarInfo());
        System.out.println(carrera.mostrarInfo());
        System.out.println(carrera2.mostrarInfo());
        System.out.println(asignatura.mostrarInfo());
        System.out.println(asignatura2.mostrarInfo());

       
        
        
        
    }
    
}
