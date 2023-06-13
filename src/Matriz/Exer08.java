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
public class Exer08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][3];

        System.out.println("Digite as notas dos alunos:");
        lerNotas(notas, scanner);

        int alunosPiorProva1 = contarAlunosPiorProva(notas, 0);
        int alunosPiorProva2 = contarAlunosPiorProva(notas, 1);
        int alunosPiorProva3 = contarAlunosPiorProva(notas, 2);

        System.out.println("Número de alunos com pior nota na prova 1: " + alunosPiorProva1);
        System.out.println("Número de alunos com pior nota na prova 2: " + alunosPiorProva2);
        System.out.println("Número de alunos com pior nota na prova 3: " + alunosPiorProva3);

        scanner.close();
    }

    // Função para ler as notas dos alunos
    public static void lerNotas(double[][] notas, Scanner scanner) {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                notas[i][j] = scanner.nextDouble();
            }
        }
    }

    // Função para contar o número de alunos cuja pior nota foi em uma determinada prova
    public static int contarAlunosPiorProva(double[][] notas, int prova) {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            int piorNota = (int)notas[i][prova];
            boolean temPiorNota = true;
            for (int j = 0; j < 3; j++) {
                if (notas[i][j] < piorNota) {
                    temPiorNota = false;
                    break;
                }
            }
            if (temPiorNota) {
                contador++;
            }
        }
        return contador;
    }
}
