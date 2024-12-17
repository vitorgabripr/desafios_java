package src.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio3 {

    public static int nMinimoMovimento(int num ){
        return (int) Math.pow(2, num) -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer>[] pinos = new List[3];
        pinos[0] = new ArrayList<>();
        pinos[1] = new ArrayList<>();
        pinos[2] = new ArrayList<>();

        System.out.println("Digite o número de discos: ");

        int n = scanner.nextInt();
        int movimento = nMinimoMovimento(n);

        System.out.println("O número mínimo de movimentos é: "+ movimento);

        for (int i = n; i >= 1 ; i++) {
            pinos[0].add(i);
        }

    }
}
