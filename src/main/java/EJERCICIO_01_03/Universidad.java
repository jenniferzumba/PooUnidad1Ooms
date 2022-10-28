/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Universidad {
    private String edificio;
    private int fechaFundacion;
    private int numeroAula;
    private String nombre;

    public Universidad(String edificio, int fechaFundacion, int numeroAula,String no) {
        this.edificio = edificio;
        this.fechaFundacion = fechaFundacion;
        this.numeroAula = numeroAula;
        this.nombre=no;
    }
    public String mostrarInfo(){
        return" la universidad politecnica fue fundada en el year "
                +this.getFechaFundacion()+" uno de los edificios conocido como"
                +this.getEdificio()+" tiene "+this.getNumeroAula()+" aulas ";
    }

    public String getEdificio() {
        return edificio;
    }

    public int getFechaFundacion() {
        return fechaFundacion;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
