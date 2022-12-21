/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
         */

        double[][] dato2 = new double[2][3];
        int fila;
        int col;

        for (fila = 0; fila < dato1.length; fila++) {
            for (col = 0; col < dato1[fila].length; col++) {
                if (dato1[fila][col] % 2 == 0) {
                    dato2[fila][col] = dato1[fila][col] * dato1[fila][col];
                } else {
                    dato2[fila][col] = dato1[fila][col];
                }

            }

        }
        for (fila = 0; fila < dato1.length; fila++) {
            for (col = 0; col < dato1[fila].length; col++) {
                System.out.printf("%.0f\t", dato2[fila][col]); // POR: ALEX RAMIREZ
            }
            System.out.println();
        }

    }

}
