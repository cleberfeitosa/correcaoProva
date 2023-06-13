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
public class Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz1 = new double[2][2];
        double[][] matriz2 = new double[2][2];

        System.out.println("Digite os valores da primeira matriz:");
        lerMatriz(matriz1, scanner);

        System.out.println("Digite os valores da segunda matriz:");
        lerMatriz(matriz2, scanner);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double[][] soma = somarMatrizes(matriz1, matriz2);
                    System.out.println("Resultado da soma das matrizes:");
                    imprimirMatriz(soma);
                    break;
                case 2:
                    double[][] subtracao = subtrairMatrizes(matriz1, matriz2);
                    System.out.println("Resultado da subtração da primeira matriz pela segunda:");
                    imprimirMatriz(subtracao);
                    break;
                case 3:
                    System.out.print("Digite a constante a ser adicionada às matrizes: ");
                    double constante = scanner.nextDouble();
                    adicionarConstante(matriz1, constante);
                    adicionarConstante(matriz2, constante);
                    System.out.println("Matrizes com a constante adicionada:");
                    System.out.println("Matriz 1:");
                    imprimirMatriz(matriz1);
                    System.out.println("Matriz 2:");
                    imprimirMatriz(matriz2);
                    break;
                case 4:
                    System.out.println("Matriz 1:");
                    imprimirMatriz(matriz1);
                    System.out.println("Matriz 2:");
                    imprimirMatriz(matriz2);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu de Opções:");
        System.out.println("(1) Somar as duas matrizes");
        System.out.println("(2) Subtrair a primeira matriz da segunda");
        System.out.println("(3) Adicionar uma constante às duas matrizes");
        System.out.println("(4) Imprimir as matrizes");
        System.out.println("(0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void lerMatriz(double[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] somarMatrizes(double[][] matriz1, double[][] matriz2) {
        double[][] resultado = new double[2][2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static double[][] subtrairMatrizes(double[][] matriz1, double[][] matriz2) {
        double[][] resultado = new double[2][2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    public static void adicionarConstante(double[][] matriz, double constante) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] += constante;
            }
        }
    }
}
