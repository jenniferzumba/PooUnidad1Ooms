/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_02_11_2022;

/**
 *
 * @author jenniferzumba
 */
public class Atencion {
    private String servicio;
    private double tiempoAtencion;
    private int fechaIngreso;
    private Mascota mascota;

    public Atencion(String servicio, double tiempoAtencion, int fechaIngreso, Mascota mascota) {
        this.servicio = servicio;
        this.tiempoAtencion = tiempoAtencion;
        this.fechaIngreso = fechaIngreso;
        this.mascota=mascota;
    }
    
    public String mostarInfo(){
        return this.mascota.getNombre()+" tiene una cita por el motivo de  "
                + this.getServicio()+" por lo que su fecha de entrada a la veterinaria es "
                +this.getFechaIngreso()+" del mes  y su tiempo de hospitalizacion es"+this.getTiempoAtencion()+" horas";
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setTiempoAtencion(double tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getServicio() {
        return servicio;
    }

    public double getTiempoAtencion() {
        return tiempoAtencion;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }
    
    
    
    
}
