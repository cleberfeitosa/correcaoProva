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
public class Exer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 5;
        int[] valores = new int[quantidadeValores];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite os " + quantidadeValores + " valores:");

        // Lendo os valores e atualizando maior, menor e soma
        for (int i = 0; i < quantidadeValores; i++) {
            valores[i] = scanner.nextInt();
            soma += valores[i];
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("Valores lidos:");

        // Exibindo os valores lidos
        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print(valores[i] + " ");
        }

        double media = (double) soma / quantidadeValores;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);

        scanner.close();
    }
}
