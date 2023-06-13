/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = 4;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("Digite os valores da matriz 4x4:");

        // Lendo os valores da matriz
        Random rd = new Random();
                
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = rd.nextInt(30);
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Encontrando a localização do maior valor
        int maiorValor = matriz[0][0];
        int linhaMaiorValor = 0;
        int colunaMaiorValor = 0;

        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaiorValor = i;
                    colunaMaiorValor = j;
                }
            }
        }

        // Exibindo a localização do maior valor
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Localização: Linha " + (linhaMaiorValor ) + ", Coluna " + (colunaMaiorValor ));

        scanner.close();
    }
}
