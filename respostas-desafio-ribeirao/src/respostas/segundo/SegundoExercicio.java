package respostas.segundo;

import java.util.Scanner;

public class SegundoExercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        int contador = 0;


        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }


        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es).");
        } else {
            System.out.println("A letra 'a' não aparece na palavra.");
        }

        scanner.close();
    }

}
