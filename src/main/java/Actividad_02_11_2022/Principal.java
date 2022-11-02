/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02_11_2022;

/**
 *
 * @author jenniferzumba
 */
public class Principal {
    public static void main(String[] args){
        
        
        var owner= new Owner(" Jennifer Zumba"," Azogues",2003);
        var owner2= new Owner(" Leydi Enriquez"," Cuenca",2007);
        var owner3= new Owner(" Saul Perez"," Quito",2012);
        
        var mascota=new Mascota("Bolita"," chiguagua",2,owner);
        var mascota2=new Mascota("Preciosa"," Pastor Aleman",4,owner2);
        var mascota3=new Mascota("Negrito"," San bernardo ",6,owner3);
        
        var atencion=new Atencion(" Revision semanal ", 3.30, 12, mascota);
        var atencion2=new Atencion(" Intoxicacion ", 4, 11, mascota2);
        var atencion3=new Atencion(" Fractura  ", 6, 7, mascota3);
        
        
        System.out.println(owner.mostarInfo());
        System.out.println(owner2.mostarInfo());
        System.out.println(owner3.mostarInfo());
        System.out.println("  ");
        System.out.println(mascota.mostarInfo());
        System.out.println(mascota2.mostarInfo());
        System.out.println(mascota3.mostarInfo());
        System.out.println("  ");
        System.out.println(atencion.mostarInfo());
        System.out.println(atencion2.mostarInfo());
        System.out.println(atencion3.mostarInfo());
        
    }
    
}
