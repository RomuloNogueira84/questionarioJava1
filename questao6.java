package questionarioaula2;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        // Questão 6 - Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        int maiorNumero = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número é " + maiorNumero);
        scanner.close();
    }
}
