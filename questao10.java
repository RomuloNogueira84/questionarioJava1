package questionarioaula2;

public class questao10 {
    public static void main(String[] args) {
        // Questão 10 -  Escreva um programa que calcula o fatorial de um número fornecido pelo usuário.

        int numero = 5;
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}

