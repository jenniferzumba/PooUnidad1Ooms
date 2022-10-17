/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02;

/**
 *
 * @author jenniferzumba 
 */
public class Principal {
    
    public static void main(String[]args){
        System.out.println("hola mundo"); 
        
        var empleado1=new Empleado();
        
        empleado1.nombre="Celia Zumba";
        empleado1.horasTrabajada=200;
        empleado1.costoHora=12;
        empleado1.yearingreso=2018;
         
        System.out.println(" El empleado "+empleado1.nombre+" tiene un ingreso de "+empleado1.calcularIngreso(2022)+
                " $ y  el bono por horas extras es de "+empleado1.calcularBonoHorasExtra()+" $ y el impuesto a pagar"
                + " es de "+empleado1.calcularImpuesto(200,300, 400)+" y el  valor total es de "+empleado1.calcularTotal(200, 300, 400,2022 )+" dolares ");
        
        var empleado2=new Empleado();
        
        empleado2.nombre="Leidy Enriquez";
        empleado2.horasTrabajada=250;
        empleado2.costoHora=12;
        empleado2.yearingreso=2012;
        
        System.out.println(" El empleado "+empleado2.nombre+" tiene un ingreso de "+empleado2.calcularIngreso(2022)+
                " $ y  el bono por horas extras es de "+empleado2.calcularBonoHorasExtra()+" $ y el impuesto a pagar "
                 + "es de "+empleado2.calcularImpuesto(200,300, 400)+" y el  valor total es de "+empleado2.calcularTotal(200, 300, 400,2022 )+" dolares ");

        
        var empleado3=new Empleado();
        
        empleado3.nombre="Esperanza Perez";
        empleado3.horasTrabajada=300;
        empleado3.costoHora=12;
        empleado3.yearingreso=2014;
        
        System.out.println(" El empleado "+empleado3.nombre+" tiene un ingreso de "+empleado3.calcularIngreso(2022)+
                " $ y  el bono por horas extras es de "+empleado3.calcularBonoHorasExtra()+ " $ y el impuesto a pagar"
                 + " es de "+empleado3.calcularImpuesto(200,300, 400)+" y el  valor total es de " +empleado3.calcularTotal(200, 300, 400,2022 )+" dolares ");
        
        
    }
}
