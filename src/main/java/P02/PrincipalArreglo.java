/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P02;

/**
 *
 * @author jenniferzumba
 */
public class PrincipalArreglo {

    public static void main(String[] args) {
        var arreglo = new Arreglo();
        System.out.println("VECTOR UNO  ");
        var vector1 = arreglo.crearVector(3);
        System.out.println("  ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vector1[i]);
        }
        System.out.println("  ");
        System.out.println("-----------------------------------------");

        System.out.println("VECTOR DOS ");
        var vector2 = arreglo.crearVector(3);
        System.out.println(" ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]);
        }
        System.out.println("  ");
        System.out.println("-----------------------------------------");

        var vectorSumado = arreglo.sumaVector(vector1, vector2);
        System.out.println("LA SUMA DE VECTORES ES  ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println(vectorSumado[i]);
        }
        System.out.println("-----------------------------------------");

        System.out.println(" MATRIZ UNO  ");
        var matriz1 = arreglo.crearMatriz(2, 3);
        System.out.println("-----------------------------------------");
        System.out.println(" MATRIZ DOS ");
        var matriz2 = arreglo.crearMatriz(2, 3);
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]);

            }

            System.out.println("  ");

            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println("  ");

        }
        System.out.println("-----------------------------------------");
        var matrizSumado = arreglo.sumaMatriz(matriz1, matriz2);
        System.out.println("LA SUMA DE LAS MATRICES ES   ");

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matrizSumado[i][j]);

            }
            System.out.println("  ");
        }

    }
}
