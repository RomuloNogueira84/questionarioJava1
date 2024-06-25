package questionarioaula2;

import java.util.Scanner;
//2- Questão escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.
public class
questao2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o número de elementos na lista: ");
            int tamanho = sc.nextInt();
            int[] lista = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Digite o elemento " + (i + 1) + ": ");
                lista[i] = sc.nextInt();
            }
            double media = 0;
            for (int i = 0; i < tamanho; i++) {
                media += lista[i];
            }
            media = media / tamanho;
            System.out.println("A média é " + media);
        }
    }

