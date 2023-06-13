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
public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        System.out.println("Digite 10 números diferentes:");

        // Lendo os números e verificando se são diferentes
        for (int i = 0; i < tamanhoVetor; i++) {
            int numero = scanner.nextInt();

            // Verificando se o número já foi digitado anteriormente
            while (contemNumero(vetor, i, numero)) {
                System.out.println("Número já digitado. Digite outro número:");
                numero = scanner.nextInt();
            }

            vetor[i] = numero;
        }

        System.out.println("Vetor final:");

        // Exibindo o vetor final digitado
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }

    // Função para verificar se um número já existe no vetor
    private static boolean contemNumero(int[] vetor, int tamanho, int numero) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
