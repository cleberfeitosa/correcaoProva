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
public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = 4;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("Digite os valores da matriz 4x4:");

        // Lendo os valores da matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int quantidadeMaioresQue10 = 0;

        // Contando os valores maiores que 10
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (matriz[i][j] > 10) {
                    quantidadeMaioresQue10++;
                }
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + quantidadeMaioresQue10);

        scanner.close();
    }
}
