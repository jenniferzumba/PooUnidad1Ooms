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
        auto1.precio=15000;
        auto1.color="Amarillo";
        auto1.year=2017;
        
        
       
        System.out.println(auto1.mostrarInfo()+" el pais de origen de la marca es "+auto1.getPaisMarca());  
        System.out.println("La provincia de matricula es:"+ auto1.getProvincial());
        System.out.println("El numero de continente es; "+auto1.getNumeroContinente());
        System.out.println("El auto tiene "+auto1.calcularEdad(2022)+"years");
        System.out.println("El auto es de "+auto1.getPaisMarca()+"\n"+auto1.getProvincial()+"\n"+auto1.calcularDepreciacion(2022)+"\n"+auto1.calcularIVA()+"\n"+auto1.calcularCostoMatricula(2022));

        
        var auto2 =new Auto();
        auto2.placa="ABF0467";
        auto2.marca="Toyota";
        auto2.nombrePropietario=" Mariana ortiz";
        auto2.precio=15000;
        auto2.color="Gris";
        auto2.year=2019;
        
        
        
        System.out.println(auto2.mostrarInfo()+" el pais de origen de la marca es "+auto2.getPaisMarca());  
        System.out.println("La provincia de matricula es:"+ auto2.getProvincial());
        System.out.println("El numero de continente es; "+auto2.getNumeroContinente());
        System.out.println("El auto tiene "+auto2.calcularEdad(2022)+" years ");
        System.out.println("El auto es de "+auto2.getPaisMarca()+"\n"+auto2.getProvincial()+"\n"+auto2.calcularDepreciacion(2022)+"\n"+auto2.calcularIVA()+"\n"+auto2.calcularCostoMatricula(2022));
        
        var auto3 =new Auto();
        auto3.placa="ABF643";
        auto3.marca="Jac";
        auto3.nombrePropietario=" luz Andrade";
        auto3.precio=15000;
        auto3.color="Azul";
        auto3.year=2018;
        
        
        System.out.println(auto3.mostrarInfo()+" el pais de origen de la marca es "+auto3.getPaisMarca());  
        System.out.println("La provincia de matricula es:"+ auto3.getProvincial());
        System.out.println("El numero de continente es; "+auto3.getNumeroContinente());
        System.out.println("El auto tiene "+auto3.calcularEdad(2022)+" years ");  
        System.out.println("El auto es de "+auto3.getPaisMarca()+"\n"+auto3.getProvincial()+"\n"+auto3.calcularDepreciacion(2022)+"\n"+auto3.calcularIVA()+"\n"+auto3.calcularCostoMatricula(2022));

        
        var auto4 =new Auto();
        auto4.placa="ABF432";
        auto4.marca="Ford";
        auto4.nombrePropietario=" fernanda Zumba";
        auto4.precio=15000;
        auto4.color="Blanco";
        auto4.year=2016;
        
        
        System.out.println(auto4.mostrarInfo()+" el pais de origen de la marca es "+auto4.getPaisMarca());  
        System.out.println("La provincia de matricula es:"+ auto4.getProvincial());
        System.out.println("El numero de continente es; "+auto4.getNumeroContinente());
        System.out.println("El auto tiene "+auto4.calcularEdad(2022)+" years "); 
        System.out.println("El auto es de "+auto4.getPaisMarca()+"\n"+auto4.getProvincial()+"\n"+auto4.calcularDepreciacion(2022)+"\n"+auto4.calcularIVA()+"\n"+auto4.calcularCostoMatricula(2022));
        
        
        var auto5 =new Auto();
        auto5.placa="AHU243";
        auto5.marca="Mercedez Benz";
        auto5.nombrePropietario=" Daniel Perez";
        auto4.precio=15000;
        auto4.color="rojo";
        auto4.year=2013;
        
        
        System.out.println(auto5.mostrarInfo()+" el pais de origen de la marca es "+auto5.getPaisMarca());  
        System.out.println("La provincia de matricula es:"+ auto5.getProvincial());
        System.out.println("El numero de continente es; "+auto5.getNumeroContinente());
        System.out.println("El auto tiene "+auto5.calcularEdad(2022)+" years "); 
        System.out.println("El auto es de "+auto5.getPaisMarca()+"\n"+auto5.getProvincial()+"\n"+auto5.calcularDepreciacion(2022)+"\n"+auto5.calcularIVA()+"\n"+auto5.calcularCostoMatricula(2022));

        
        
        
        
    }  
              
    
    
}
