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
         
        /*var progra=new Asignatura();
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
        
        System.out.println(electronica.mostrarInformacion());*/
        
        
        
        
        
        
        
        
        var auto1 =new Auto();
        auto1.placa="ABF6592";
        auto1.marca="Chevrolet";
        auto1.nombrePropietario=" Juana Moreno";
        
       
        System.out.println(auto1.mostrarInfo()+" el pais de origen de la marca es "+auto1.getPaisMarca());  
        
        
        var auto2 =new Auto();
        auto2.placa="ABF0467";
        auto2.marca="Toyota";
        auto2.nombrePropietario=" Mariana ortiz";
        
        
        System.out.println(auto2.mostrarInfo()+" el pais de origen de la marca es "+auto2.getPaisMarca());  
        
        
        var auto3 =new Auto();
        auto3.placa="ABF643";
        auto3.marca="Jac";
        auto3.nombrePropietario=" luz Andrade";
        
        
        System.out.println(auto3.mostrarInfo()+" el pais de origen de la marca es "+auto3.getPaisMarca());  
              
        
        var auto4 =new Auto();
        auto4.placa="ABF432";
        auto4.marca="Ford";
        auto4.nombrePropietario=" fernanda Zumba";
        
        
        System.out.println(auto4.mostrarInfo()+" el pais de origen de la marca es "+auto4.getPaisMarca());  
        
        var auto5 =new Auto();
        auto5.placa="AHU243";
        auto5.marca="Mercedez Benz";
        auto5.nombrePropietario=" Daniel Perez";
        
        
        System.out.println(auto5.mostrarInfo()+" el pais de origen de la marca es "+auto5.getPaisMarca());  
              
    }
    
    
}
