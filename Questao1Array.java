import java.util.Scanner;

public class Questao1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite os números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Números " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for (int num : numeros) {
            System.out.println(num + " ");
        }
        sc.close();
    }
}
