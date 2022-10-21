/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_03;

import poounidad1ooms.*;

/**
 *
 * @author jenniferzumba
 */
public class Auto {
    String placa;
    String marca;
    int year; 
    String color;
    double precio;
    int cilindraje;
    Propietario owner;
    LugarMatriculacion matricula;
    
    

    public String mostrarInfo() {
        var retorno = "El auto tiene placa: " + this.placa + " es de marca " 
                + this.marca + " y el propietario es: " + this.owner.nombre+
                "la dirrecion del propietario es"+this.owner.direccion+
                " cuesta "+this.precio+" USD y es modelo: "+this.year+
                " la matricula se realiza en la privincia de "+this.matricula.provincia+ "en la ciudad de  "+this.matricula.cuidad+
                " la descripcion es "+this.matricula.descripcion+"el numero de telefono en la matricula es"+this.matricula.telefono;

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
    public boolean esClasico(int yearActual, int yearClasico){
        var retorno=false;
        
        return retorno;
        
    }
    /*
    edad >20: tasa solidaria 0
    edad0-5 : y cilidraje <1500: tasa solidaria 15% costo
    edad0-5 : y cilidraje >1500<2000: tasa solidaria 20% costo
    edad0-5 : y cilidraje >2000: tasa solidaria 25% costo
    edad0-5 : y cilidraje <1500: tasa solidaria 10% costo
    edad0-5 : y cilidraje >1500<2000: tasa solidaria 15% costo
    edad0-5 : y cilidraje >2000: tasa solidaria 18% costo
    edad 

    
    //g1 y g2 Auto 7años, 1600cc, 18000USD = 2700USD
    //g3 y g8 Auto 4años, 1000cc, 8000USD = 1200USD
    //g3 y g9 Auto 16años, 2000cc, 10000USD = 5000USD
    //g4 y g10 Auto 8años, 3600cc, 17000USD = 3060USD
    //g5 y g11 Auto 9años, 1200cc, 1100USD = 110 USD
    //g6 y g12 Auto 21años, 1000cc, 14000USD = 0 USD
    //g7 y g13 Auto 19años, 24000cc, 16000USD = 800USD
    */
    public double calcularTasaSolidaria(int yearActual, double limitePrecio){
        var retorno=0.0d;
        var edad = this.calcularEdad(yearActual);
        if((edad>=0)&&(edad<5)&&(cilindraje<1500)){
            retorno=precio*0.15;
        }
        if((edad>=0)&&(edad<5)&&(cilindraje>1500)&&(cilindraje<2000)){
            retorno=precio*0.20;
        }
        if((edad>=0)&&(edad<5)&&(cilindraje>2000)){
            retorno=precio*0.25;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje<1500)){
            retorno=precio*0.10;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje>1500)&&(cilindraje<2000)){
            retorno=precio*0.15;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje<2000)){
            retorno=precio*0.18;
        }
        if((edad>=15)&&(edad<20)){
            retorno=precio*0.5;
        }
        if((edad>20)){
            retorno=precio;
        }
        
        
        return retorno;
        
    }
    public boolean esPlacaValidA(){
        var retorno=false;
        var longitud=this.placa.length();
        if(longitud==7){
            var caracter1=this.placa.charAt(0);
            var caracter2=this.placa.charAt(1);
            var caracter3=this.placa.charAt(2);
            var caracter4=this.placa.charAt(3);
            var caracter5=this.placa.charAt(4);
            var caracter6=this.placa.charAt(5);
            var caracter7=this.placa.charAt(6);    
        
        if(Character.isLetter(caracter1)
                &&Character.isLetter(caracter2)
                &&Character.isLetter(caracter3)&&Character.isDigit(caracter4)
                &&Character.isDigit(caracter5)&&Character.isDigit(caracter6)
                &&Character.isDigit(caracter7)){
            retorno= true;
            
        }
        
       
        }    
       return retorno;
    }
    
   
    
 
    
}
