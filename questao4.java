package questionarioaula2;
import java.util.Scanner;
//Questão 4 - Escreva um programa que leia um número inteiro e mostre a soma de todos os números pares entre 1 e esse número.
public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("Fatores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}

