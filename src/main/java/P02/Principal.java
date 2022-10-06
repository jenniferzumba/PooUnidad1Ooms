/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P02;

/**
 *
 * @author jenniferzumba
 */
public class Principal {
    
    public static void main(String[]args){
        System.out.println("hola mundo"); 
         
        var progra=new Asignatura();
        progra.codigo=1;
        progra.costoHora=3.5;
        progra.horas=160;
        progra.nombre="programacio orientada a objetos";
        progra.nombreDocente="Mauricio Ortiz Ochoa";
        progra.vigente=true;
        
        System.out.println(progra.mostrarInformacion());
        
        var ecuaciones=new Asignatura();
        ecuaciones.codigo=2;
        ecuaciones.costoHora=3.5;
        ecuaciones.horas=80;
        ecuaciones.nombre="ecuaciones diferenciales";
        ecuaciones.nombreDocente="Xavier Leonardo Armijos";
        ecuaciones.vigente=true;
        
        System.out.println(ecuaciones.mostrarInformacion());
        
        var electronica=new Asignatura();
        electronica.codigo=3;
        electronica.costoHora=3.5;
        electronica.horas=120;
        electronica.nombre="electronica";
        electronica.nombreDocente="Juan Diego";
        electronica.vigente=true;
        
        System.out.println(electronica.mostrarInformacion());
        
              
    }
    
}
