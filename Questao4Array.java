import java.util.Scanner;

public class Questao4Array {
    public static void main (String[] args) {
        char[] letras = new char[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 10 caracteres: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Letra " + (i + 1));
            letras[i] = sc.next().charAt(0);
        }

        System.out.println("Suas letras são: " + new String(letras)); // tem que transformar para string para leitura correta das letras

            System.out.println("Suas letras somente com consoantes são: " );
            for (char c : letras) {
                if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                    System.out.println(c);
                }
            }
sc.close();

    }
}
