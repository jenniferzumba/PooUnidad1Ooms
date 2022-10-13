/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P02;

/**
 *
 * @author jenniferzumba
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year; 
    String color;
    double precio;
    
    

    public String mostrarInfo() {
        var retorno = "El auto tiene placa: " + this.placa + " es de marca " + this.marca + " y el propietario es: " + this.nombrePropietario+" cuesta "+this.precio+" USD y es modelo: "+this.year;

        return retorno;
    }
    public String getProvincial() {
        var retorno = "";
        var primeraLetra="";
        primeraLetra=this.placa.substring(0,1);
        switch (primeraLetra){
            case "A":
                retorno=" Azuay";
                break;
            case"P":
                retorno="Pichincha";
                break;
            case"G":
                retorno="Guayas";
                break;
            case"U":
                retorno="Cañar";
                break;  
            default:
                retorno="Provinvia no definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {
                if (this.marca.equals("Ford")) {
                    retorno = "China";
                } else {
                    if (this.marca.equals("Mercedez Benz")) {
                        retorno = "Alemania";
                    } else {
                        retorno = "No definido";
                    }
                }
            }
        }
        return retorno;
    }
    public int getNumeroContinente() {
        var retorno = 0;
        var marcaPais=this.getPaisMarca();
        switch (marcaPais){
            case"EE.UU":
                retorno=2;
                break;
            case"Japon":
                retorno=3;
                break;
            default:
                retorno=0;
        }

        return retorno;
    }
    public double calcularIVA(){
        var retorno=0.0d;
        retorno=this.precio*0.12;
        
        return retorno;  
    }
    public int calcularEdad(int yearActual){
        var retorno=0;        
        retorno=yearActual-this.year;
      
        return retorno;
    }
    //10% por cada año de uso
    //la depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        retorno=edad*0.1*this.precio;
        

        return retorno;      
    }
    /*
    si la edad de 0-5 :10% del precio
    si la edad de 5-10 :8% del precio
    si la edad de 10-15 :7% del precio
    si la edad de edad>15 :6% del precio
    
    */
    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        if (edad < 6) {
            retorno = this.precio * 0.1;
        } else {
            if (edad > 5 && edad < 11) {
                retorno = this.precio * 0.08;
            } else {
                if (edad > 10 && edad < 16) {
                    retorno = this.precio * 0.07;
                } else {
                    if (edad > 16) {
                        retorno = this.precio * 0.06;
                    }

                }
            }
        }
        
        return retorno;
    }
    /*edad 0-5 de 10000 si 
    edad 10-15 de 10000 a 20000 si 
    edad>15  de 20000 a 30000 si 
    edad > 15 no*/
    public boolean sepuedeAsegurar(int yearActual) {
        var retorno = false;
        var edad = this.calcularEdad(yearActual);
        if (edad <= 5 && this.precio < 10000) {
            retorno = true;
        } else {
            if (edad > 5 && edad < 11 && this.precio >= 10000 && this.precio <= 20000) {
                retorno = true;
            } else {
                if (edad > 10 && edad < 16 && this.precio >= 20000 && this.precio <= 30000) {
                    retorno = true;
                } else {
                    if (edad > 16) {
                        retorno = false;
                    }

                }
            }
        }
        
        return retorno;
    }
   
    
 
           
}
