import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questão5Array {
    public static void main (String[] args) {
        int[] numeros = new int[20];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 20 números: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1));
            numeros[i] = sc.nextInt();

            }
        
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);


            }

            else {
                impares.add(numeros[i]);

            }

            System.out.println("Os números são: " + Arrays.toString(numeros));
            System.out.println("Os números pares são: " + pares);
            System.out.println("Os números ímpares são: " + impares);
        }

    }
