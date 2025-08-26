import java.util.Scanner;

public class Questao2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite os 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números digitados em ordem invertida: ");
        for (int num = numeros.length; num > 0; num--) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
