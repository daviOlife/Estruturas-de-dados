import java.util.Scanner;

public class Questao3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] notas = new int[4];
        int soma = 0;

        System.out.println("Digite suas notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1));
            notas[i] = sc.nextInt();
        }

           for (int h = 0; h < notas.length; h++) {
            soma += notas[h]; 
        }

    sc.close();
    
        double media = soma / notas.length;
        System.out.println("Sua média é: " + media);
    }
    

     
}
