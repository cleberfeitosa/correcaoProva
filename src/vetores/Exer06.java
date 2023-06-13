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
public class Exer06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor:");

        // Lendo os valores do vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Atribuindo valor 0 aos elementos negativos
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("Vetor após atribuição:");

        // Exibindo o vetor atualizado
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
