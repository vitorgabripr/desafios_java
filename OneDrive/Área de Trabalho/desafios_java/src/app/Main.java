package src.app;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número para saber o fatorial dele: ");

            int numero = scanner.nextInt();

            BigInteger fatorial = BigInteger.ONE;

            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
            String fatorialFormatado = String.format("%,d", fatorial);
            System.out.println("O fatorial do número " + numero + " é " + fatorialFormatado);
        }
    }
}
