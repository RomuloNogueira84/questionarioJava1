package questionarioaula2;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        // Questão 7 - Escreva um programa que conta o número de vogais em uma frase fornecida pelo usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }

        if (vogais == 0) {
            System.out.println("A frase não contém vogais.");
        } else {
            System.out.println("A frase contém " + vogais + " vogais.");
        }

        scanner.close();
    }
}

