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
public class Exer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetorOriginal = new int[tamanhoVetor];
        int[] vetorImpares = new int[tamanhoVetor];
        int indiceImpares = 0;

        System.out.println("Digite 10 números inteiros no intervalo de 0 a 50:");

        // Lendo os números e preenchendo o vetor original
        for (int i = 0; i < tamanhoVetor; i++) {
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 50) {
                vetorOriginal[i] = numero;

                if (numero % 2 != 0) {
                    vetorImpares[indiceImpares] = numero;
                    indiceImpares++;
                }
            } else {
                System.out.println("Número inválido. Digite novamente.");
                i--;
            }
        }

        System.out.println("Vetor Original e Vetor de Ímpares:");

        // Imprimindo os vetores, 2 elementos por linha
        for (int i = 0; i < tamanhoVetor; i += 2) {
            System.out.println(vetorOriginal[i] + " " + vetorOriginal[i + 1] + "   " +
                               vetorImpares[i] + " " + vetorImpares[i + 1]);
        }

        scanner.close();
    }
}
