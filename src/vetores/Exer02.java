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
public class Exer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 5;
        int[] valores = new int[quantidadeValores];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        System.out.println("Digite os " + quantidadeValores + " valores:");

        // Lendo os valores e atualizando as posições do maior e menor
        for (int i = 0; i < quantidadeValores; i++) {
            valores[i] = scanner.nextInt();
            if (valores[i] > valores[posicaoMaior]) {
                posicaoMaior = i;
            }
            if (valores[i] < valores[posicaoMenor]) {
                posicaoMenor = i;
            }
        }

        System.out.println("Posição do maior valor: " + posicaoMaior);
        System.out.println("Posição do menor valor: " + posicaoMenor);

        scanner.close();
    }
}
