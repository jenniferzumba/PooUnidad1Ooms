/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_01_03;

/**
 *
 * @author jenniferzumba
 */
public class Matricula {
    private String provincia;
    private String ciudad;
    private Auto yearMatriculacion;
    private Propietario persona;

    public Matricula(String pro, String ci, Auto ma,Propietario po) {
        this.provincia = pro;
        this.ciudad = ci;
        this.yearMatriculacion = ma;
        this.persona=po;
    }
    public String mostrarInfo(){
        return" La matricula fue realizada en la provincia de " 
                +this.getProvincia()+" en la cuidad de "
                +this.getCiudad()+" el year de matriculacion del auto es "
                +this.yearMatriculacion.getYear()+" y el auto pertenece a "
                +this.persona.getNombre();
        
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Auto getPlaca() {
        return yearMatriculacion;
    }

    public Propietario getPersona() {
        return persona;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPlaca(Auto yearMatriculacion) {
        this.yearMatriculacion= yearMatriculacion;
    }

    public void setPersona(Propietario persona) {
        this.persona = persona;
    }
    
    
    
    
    
}
