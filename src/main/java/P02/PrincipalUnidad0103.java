/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P02;

import java.util.Scanner;

/**
 *
 * @author jenniferzumba
 */
public class PrincipalUnidad0103 {
     public static void main(String[] args){
    var a = 0;
      /*  System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        while (a < 100) {
            System.out.println("a = " + a);
            a++;
        }
        var numero=0;
        //leer datos del teclado
        do {
            var lectura = new Scanner(System.in);
            System.out.println("Ingresar números menores a 10");
            numero = lectura.nextInt();
            System.out.println("numero = " + numero);
        } while (numero < 10);
        
        
        for (var i = 0; i < 10; i++) {
            System.out.println("Hola "+i);
        }
        
        var numeroList = new int[5];
        numeroList[0]=7;
        numeroList[1]=9;
        numeroList[2]=4;
        numeroList[3]=11;
        numeroList[4]=3;
        
        var numeroDecimalList = new double[5];
        numeroDecimalList[0]=8.5;
        numeroDecimalList[1]=4.0;
        numeroDecimalList[2]=9.3;
        numeroDecimalList[3]=6.4;
        numeroDecimalList[4]=3.9;
        
        
        for (var i = 0; i < numeroList.length; i++) {
            System.out.println(numeroList[i]);
        }
        for (var i = 0; i < numeroDecimalList.length; i++) {
            System.out.println(numeroDecimalList[i]);
        }
       */
    
        // ejercicio 2
      /*  System.out.println(" ingresar la dimension del arreglo unidimendional o arreglo");
        var lectura = new Scanner(System.in);
        var dimension = lectura.nextInt();
            
        System.out.println("Ingrese los numeros");
        var numero=new int[dimension];
        
        
        
        for (int i=0; i<numero.length; i++){
            System.out.println("ingresar el  numero de la posicion "+(i+1));
             numero[i] =lectura.nextInt();
        }
        for(int  i=0;i<numero.length;i++){
            System.out.println(" La posicion del numero " +i+" es "+numero[i] );
            
        }
        
        System.out.println("ingrese el numero de filas que tendra la matriz");
        var fila=lectura.nextInt();
        System.out.println("ingrese el numero de colunmas que tendra la matriz");
        var columna=lectura.nextInt(); 
        
        var matriz =new int [fila][columna];
        
        System.out.println("ingrese el valor correspondiente a la posicion 0,0");
        matriz[0][0]=lectura.nextInt();
        System.out.println("ingrese el valor correspondiente a la posicion 0,1");
        matriz[0][1]=lectura.nextInt();
        System.out.println("ingrese el valor correspondiente a la posicion 0,2");
        matriz[0][2]=lectura.nextInt();
        System.out.println("ingrese el valor correspondiente a la posicion 1,0");
        matriz[1][0]=lectura.nextInt();
        System.out.println("ingrese el valor correspondiente a la posicion 1,1");
        matriz[1][1]=lectura.nextInt();
        System.out.println("ingrese el valor correspondiente a la posicion 1,2");
        matriz[1][2]=lectura.nextInt();
        
        System.out.println(matriz[0][0]+" "+matriz[0][1]+" "+matriz [0][2]);
        System.out.println(matriz[1][0]+" "+matriz[1][1]+" "+matriz [1][2]);      
        
        */
        var lectura = new Scanner(System.in);
        
        System.out.println("ingrese el numero de filas que tendra la matriz");
        var filas=lectura.nextInt();
        System.out.println("ingrese el numero de colunmas que tendra la matriz");
        var columnas=lectura.nextInt(); 
        
        var matriz =new int[filas][columnas];
        
        for (int i= 0; i <filas; i++){
            for(int j=0; j<columnas;j++){
                System.out.println("Ingrese el numero en la posicion " +i +", "+j);
                matriz[i] [j]=lectura.nextInt();
                
            }      
           
        }
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.print( matriz[i]  [j]);
            }
            System.out.println("  ");
            
        }
        
        
       /* var matriz=new int[filas][columnas];
        var i=0;
        while(i<matriz.length){
            var j=0;
            while(j<matriz[i].length){
                System.out.println(matriz[i][j]);
                j++;
            }
            i++;
        }
        for (i=0; i<matriz.length; i++){
            for (var j=0; j<matriz[i].length;j++){
                System.out.println(matriz[i][j]*10);
                
            }
        }
        for (int x[]:matriz){
            for (var y:x){
                System.out.println(y*100);
            }
        }*/
 
         
        
    }

    
    
    
}
