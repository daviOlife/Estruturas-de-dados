import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bucketsort {

    // método principal que organiza um vetor usando o BucketSort
    public static void bucketSort(float[] array) {
        int n = array.length;

        // caso o vetor esteja vazio ou tenha apenas 1 elemento, não há nada para ordenar
        if (n <= 0) return;

        // criação dos "baldes" (listas que armazenam elementos por faixa de valores)
        // cada bucket é uma lista que vai armazenar números com valores próximos
        ArrayList<Float>[] buckets = new ArrayList[n];

        // inicializa cada bucket (vazio no início)
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // distribui os elementos do vetor original entre os baldes
        // a fórmula usada (array[i] * n) supõe que os números estão entre 0 e 1.
        // para outros intervalos, seria necessário normalizar.
        for (int i = 0; i < n; i++) {
            // define o índice do balde
            int bucketIndex = (int) (array[i] * n); 
            // evita "ArrayIndexOutOfBounds"
            if (bucketIndex >= n) bucketIndex = n - 1; 
            buckets[bucketIndex].add(array[i]);
        }

        // ordena individualmente cada balde (usando Collections.sort)
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // concatena os baldes de volta no vetor original (em ordem)
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                array[index++] = value;
            }
        }
    }

    // método auxiliar para gerar um vetor aleatório de números entre 0 e 1
    public static float[] generateRandomArray(int size) {
        Random random = new Random();
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            // gera valores entre 0 e 1
            array[i] = random.nextFloat(); 
        }
        return array;
    }

    // método auxiliar para imprimir o vetor
    public static void printArray(float[] array, int limit) {
        for (int i = 0; i < Math.min(array.length, limit); i++) {
            System.out.printf("%.4f ", array[i]);
        }
        // evita prints longos
        if (array.length > limit) System.out.print("..."); 
        System.out.println();
    }

    // método principal para testar o bucket sort com vetores de diferentes tamanhos
    public static void main(String[] args) {

        // testes com vetores de tamanhos diferentes
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("Tamanho do vetor: " + size);

            float[] array = generateRandomArray(size);

            System.out.println("Antes da ordenação:");
            // mostra os primeiros 10 valores
            printArray(array, 10); 

            // aplica o Bucket Sort
            bucketSort(array);

            System.out.println("Depois da ordenação:");
            printArray(array, 10);
        }
    }
}
