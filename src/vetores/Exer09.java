/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorCombinado = new int[tamanhoVetor * 2];

        System.out.println("Digite os valores do primeiro vetor:");

        // Lendo os valores do primeiro vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");

        // Lendo os valores do segundo vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Combinando os vetores A e B no vetor combinado
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorCombinado[i * 2] = vetorA[i]; // Posições pares
            vetorCombinado[i * 2 + 1] = vetorB[i]; // Posições ímpares
        }

        System.out.println("Vetor combinado:");

        // Exibindo o vetor combinado
        for (int i = 0; i < tamanhoVetor * 2; i++) {
            System.out.println(vetorCombinado[i]);
        }

        scanner.close();
    }
}
