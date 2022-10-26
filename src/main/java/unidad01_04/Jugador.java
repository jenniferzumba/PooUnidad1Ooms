/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad01_04;

/**
 *
 * @author jenniferzumba
 */
public class Jugador extends Persona{
    
    
    private  String posicion;
    private Seleccion equipo;
    
    public String mostarInfoJugador(){
        return this.mostrarInfo()+" juega en la posición de: "+this.posicion
                 +" pertenece al esquipo de: "+this.equipo.getNombre();
    }


    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }
    
     
}
