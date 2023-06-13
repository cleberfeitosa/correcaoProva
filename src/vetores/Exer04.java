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
public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 20;
        int[] vetor = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor:");

        // Lendo os valores do vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos únicos:");

        // Verificando e escrevendo os elementos únicos
        for (int i = 0; i < tamanhoVetor; i++) {
            boolean repetido = false;

            // Verifica se o elemento já foi encontrado antes
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    repetido = true;
                    break;
                }
            }

            // Se não for repetido, escreve o elemento
            if (!repetido) {
                System.out.print(vetor[i]+", ");
            }
        }

        scanner.close();
    }
}
