package questionarioaula2;

public class questao8 {
    public static void main(String[] args) {
        // Questão 8 - Escreva um programa que converte um número decimal em binário.

        int numeroDecimalo = 10;
        String binario = "";

        for (int i = 0; i < numeroDecimalo; i++) {
            if (numeroDecimalo % 2 == 0) {
                binario += "0";
            } else {
                binario += "1";
            }
            numeroDecimalo /= 2;
        }

        System.out.println(binario);
    }
}
