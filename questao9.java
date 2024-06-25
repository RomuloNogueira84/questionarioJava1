package questionarioaula2;

public class questao9 {
    public static void main(String[] args) {
        // Questão 9 - 9. Escreva um programa que verifica se uma string é um palíndromo.

        String palindromo = "A manhã foi um prazer incrível";
        String palindromo2 = "A manhã foi um prazer incrível";
        String palindromo3 = "A manhã foi um prazer incrível!";
        String palindromo4 = "A manhã foi um prazer incrível!";

        if (palindromo.equals(palindromo2)) {
            System.out.println("A string é um palíndromo");
        } else {
            System.out.println("A string não é um palíndromo");
        }

        if (palindromo.equals(palindromo3)) {
            System.out.println("A string é um palíndromo");
        } else {
            System.out.println("A string não é um palíndromo");
        }

        if (palindromo.equals(palindromo4)) {
            System.out.println("A string é um palíndromo");
        } else {
            System.out.println("A string não é um palíndromo");
        }
    }
}

