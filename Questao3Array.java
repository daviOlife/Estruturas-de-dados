import java.util.Scanner;

public class Questao3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[4];
        int soma = 0;

        System.out.println("Digite suas notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + (i + 1));
            notas[i] = sc.nextInt();
        }

        for (int media = 0; media < notas.length; media++) {
            soma += notas[i];
        }

        double media = soma / numeros.length;
        System.out.println("Média: " + media);
    }
}
