/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P02;

/**
 *
 * @author jenniferzumba
 * 2022/10/06
 * clase que sirve para modelar una asignatura con 6 atributos
 */
public class Asignatura {
    int codigo;
    String nombre;
    int horas;
    String nombreDocente;
    double costoHora;
    boolean vigente;
    
    String mostrarInformacion(){
        var retorno="la asignatura es:"+this.nombre+" el docente es:"+this.nombreDocente+" la asignatura cuesta"+calcularCosto();
        return retorno;
    }
    double calcularCosto(){
        var retorno=this.costoHora*this.horas;
        return retorno;
    }
    
    
}
