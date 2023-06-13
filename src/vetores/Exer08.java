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
public class Exer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A:");

        // Lendo os valores do vetor A
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");

        // Lendo os valores do vetor B
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Calculando o vetor C = A - B
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C (A - B):");

        // Exibindo os valores do vetor C
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetorC[i]);
        }

        scanner.close();
    }
}
