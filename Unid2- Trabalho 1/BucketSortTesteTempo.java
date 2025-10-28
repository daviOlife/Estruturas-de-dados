import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BucketSortTesteTempo {

    public static void bucketSort(float[] array) {
        int n = array.length;
        if (n <= 0) return;


        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }


        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (array[i] * n);
            if (bucketIndex >= n) bucketIndex = n - 1;
            buckets[bucketIndex].add(array[i]);
        }


        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }


        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                array[index++] = value;
            }
        }
    }


    public static float[] generateRandomArray(int size, Random rnd) {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextFloat();
        }
        return array;
    }

    public static float[] copyArray(float[] original) {
        float[] copy = new float[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    public static void main(String[] args) {

        int[] sizes = {10, 100, 1000, 10000};
        int repetitions = 10;

        System.out.println("TESTE DE TEMPO:");


        Random rnd = new Random(12345);


        for (int w = 0; w < 5; w++) {
            float[] warm = generateRandomArray(1000, rnd);
            bucketSort(warm);
        }

        for (int size : sizes) {

            System.out.println("Tamanho do vetor: " + size);


            float[] baseArray = generateRandomArray(size, rnd);

            long totalTime = 0;


            for (int i = 0; i < repetitions; i++) {
                float[] testArray = copyArray(baseArray);

                long startTime = System.nanoTime();
                bucketSort(testArray);
                long endTime = System.nanoTime();

                totalTime += (endTime - startTime);
            }

            double averageTimeNs = (double) totalTime / repetitions;
            double averageTimeMs = averageTimeNs / 1_000_000.0;

            System.out.printf("Tempo médio: %.4f ms (%d repetições)\n", averageTimeMs, repetitions);
        }

    }
}

