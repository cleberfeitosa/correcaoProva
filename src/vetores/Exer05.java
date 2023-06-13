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
public class Exer05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 5;
        double[] vetor = new double[tamanhoVetor];

        System.out.println("Digite os valores do vetor:");

        // Lendo os valores do vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Digite o código de ordenação (0 para sair, 1 para ordem direta, 2 para ordem inversa):");
        int codigo = scanner.nextInt();

        if (codigo == 0) {
            System.out.println("Programa finalizado.");
        } else if (codigo == 1) {
            System.out.println("Vetor na ordem direta:");
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.println(vetor[i]);
            }
        } else if (codigo == 2) {
            System.out.println("Vetor na ordem inversa:");
            for (int i = tamanhoVetor - 1; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
        } else {
            System.out.println("Código inválido.");
        }

        scanner.close();
    }
}
