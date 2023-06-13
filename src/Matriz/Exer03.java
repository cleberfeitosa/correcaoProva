/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer03 {
    public static void main(String[] args) {
        int tamanhoMatriz = 4;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        // Preenchendo a matriz com o produto do valor da linha e da coluna de cada elemento
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = (i+1)  * (j+1) ;
            }
        }

        // Exibindo a matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
