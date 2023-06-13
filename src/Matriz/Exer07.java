/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

import java.util.Random;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer07 {
     public static void main(String[] args) {
        int[][] cartela = gerarCartela();
        exibirCartela(cartela);
    }

    // Função para gerar uma cartela de bingo
    public static int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero;
                boolean repetido;

                do {
                    numero = random.nextInt(100);
                    repetido = verificarRepeticao(cartela, numero);
                } while (repetido);

                cartela[i][j] = numero;
            }
        }

        return cartela;
    }

    // Função para verificar se um número já está presente na cartela
    public static boolean verificarRepeticao(int[][] cartela, int numero) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartela[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    // Função para exibir a cartela de bingo
    public static void exibirCartela(int[][] cartela) {
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
