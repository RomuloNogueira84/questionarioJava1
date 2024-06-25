package questionarioaula2;
import java.util.Scanner;
public class questao5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            scanner.close();

            boolean primo = true;
            if (numero <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
    }
    // Explicando simples código verifica se o número que você digitou é primo ou não. Um número primo é aquele
// que só é divisível por 1 e por ele mesmo.
