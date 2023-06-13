/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

import java.util.Scanner;

/**
 *
 * @author Cleber Feitosa
 */
public class Exer09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] notas = new int[5][4];

        // Passo (a): Ler as três primeiras informações de cada aluno
        System.out.println("Digite as informações dos alunos:");
        lerInformacoesAlunos(notas, scanner);

        // Passo (b): Calcular a nota final para cada aluno
        calcularNotaFinal(notas);

        // Passo (c): Encontrar o aluno com a maior nota final
        int alunoMaiorNota = encontrarAlunoMaiorNota(notas);
        System.out.println("Matrícula do aluno com maior nota final: " + notas[alunoMaiorNota][0]);

        // Passo (d): Calcular a média aritmética das notas finais
        double mediaNotasFinais = calcularMediaNotasFinais(notas);
        System.out.println("Média das notas finais: " + mediaNotasFinais);

        scanner.close();
    }

    // Função para ler as três primeiras informações de cada aluno
    public static void lerInformacoesAlunos(int[][] notas, Scanner scanner) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = scanner.nextInt();
            }
        }
    }

    // Função para calcular a nota final para cada aluno
    public static void calcularNotaFinal(int[][] notas) {
        for (int i = 0; i < 5; i++) {
            int mediaProvas = notas[i][1];
            int mediaTrabalhos = notas[i][2];
            int notaFinal = mediaProvas + mediaTrabalhos;
            notas[i][3] = notaFinal;
        }
    }

    // Função para encontrar o índice do aluno com a maior nota final
    public static int encontrarAlunoMaiorNota(int[][] notas) {
        int maiorNota = notas[0][3];
        int indiceMaiorNota = 0;
        for (int i = 1; i < 5; i++) {
            if (notas[i][3] > maiorNota) {
                maiorNota = notas[i][3];
                indiceMaiorNota = i;
            }
        }
        return indiceMaiorNota;
    }

    // Função para calcular a média aritmética das notas finais
    public static double calcularMediaNotasFinais(int[][] notas) {
        int somaNotasFinais = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasFinais += notas[i][3];
        }
        return (double) somaNotasFinais / 5;
    }
}
