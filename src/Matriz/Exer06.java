/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

import java.util.Scanner;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = 4;
        int[][] matriz1 = new int[tamanhoMatriz][tamanhoMatriz];
        int[][] matriz2 = new int[tamanhoMatriz][tamanhoMatriz];
        int[][] matrizMaiores = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("Digite os valores da primeira matriz 4x4:");
        lerMatriz(matriz1, scanner);

        System.out.println("Digite os valores da segunda matriz 4x4:");
        lerMatriz(matriz2, scanner);

        // Preenchendo a matriz com os maiores valores
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matrizMaiores[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }

        System.out.println("Matriz com os maiores valores:");
        exibirMatriz(matrizMaiores);

        scanner.close();
    }

    // Função para ler os valores de uma matriz
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        int tamanhoMatriz = matriz.length;
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Função para exibir os valores de uma matriz
    public static void exibirMatriz(int[][] matriz) {
        int tamanhoMatriz = matriz.length;
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
