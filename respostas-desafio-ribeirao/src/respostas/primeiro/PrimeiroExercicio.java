package respostas.primeiro;

import java.util.Scanner;

public class PrimeiroExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
    
    public static boolean pertenceFibonacci(int numero) {
        if (numero < 0)
            return false;

        int primeiro = 0, proximo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero)
                return true;

            int atual = primeiro;
            primeiro = proximo;
            proximo = atual + proximo;

        }
        return false;
    }

}
