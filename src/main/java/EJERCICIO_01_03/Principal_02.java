/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Principal_02 {
    public static void main(String[] args) {
        
        var asignatura=new Asignatura("Calculo Integral","Xavier Armijos",4);
        var asignatura2=new Asignatura("Fundamentos de sistemas Operativos","Bertha  ",6);
        
        var estudiante=new Estudiante(" Juan Matias",15,"0350150959","centro de Azogues ");
        var estudiante2=new Estudiante(" Maria Paula",14,"0863567559","chaullabamba ");
        
        var calificacion=new Calificacion(7.8,8.9,estudiante,asignatura);
        var calificacion2=new Calificacion(6.7,8.2,estudiante2,asignatura2);
        
        System.out.println(asignatura.mostrarInfo());
        System.out.println(asignatura2.mostrarInfo());
        System.out.println(estudiante.mostrarInfo());
        System.out.println(estudiante2.mostrarInfo());
        System.out.println(calificacion.mostrarInfo());
        System.out.println(calificacion2.mostrarInfo());
        
        
        
       
      
    }
    
}
