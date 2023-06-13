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
public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor:");

        // Lendo os valores do vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean existemValoresIguais = false;

        System.out.println("Valores iguais:");

        // Verificando se existem valores iguais
        for (int i = 0; i < tamanhoVetor; i++) {
            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                    existemValoresIguais = true;
                }
            }
        }

        if (!existemValoresIguais) {
            System.out.println("Não há valores iguais.");
        }

        scanner.close();
    }
}
