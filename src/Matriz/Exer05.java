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
public class Exer05 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = 5;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("Digite os valores da matriz 5x5:");

        // Lendo os valores da matriz
        
        Random rd = new Random();
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = rd.nextInt(20);
            }
        }

        //imprimindo a matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] +"|");;
            }
            System.out.println("");
        }
        
        System.out.println("Digite o valor a ser buscado na matriz:");
        int valorBusca = scanner.nextInt();

        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        // Buscando o valor na matriz
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                if (matriz[i][j] == valorBusca) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Exibindo o resultado da busca
        if (encontrado) {
            System.out.println("Valor encontrado na matriz!");
            System.out.println("Localização: Linha " + (linhaEncontrada + 1) + ", Coluna " + (colunaEncontrada + 1));
        } else {
            System.out.println("Valor não encontrado na matriz.");
        }

        scanner.close();
    } 
}
