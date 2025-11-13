package Unidade2;


import java.util.Random;

public class BucketSortTesteTempo {

    public static void main(String[] args) {

        // tamanhos de vetores para teste
        int[] sizes = {10, 100, 1000, 10000, 100000};
        int repetitions = 10;

        System.out.println("TESTE DE TEMPO - BUCKET SORT");

        Random rnd = new Random(12345);

        // aquecimento da JVM (para resultados mais estáveis)
        for (int w = 0; w < 5; w++) {
            float[] warmup = Unidade2.Bucketsort.generateRandomArray(1000);
            Unidade2.Bucketsort.bucketSort(warmup);
        }

        // execução principal
        for (int size : sizes) {

            System.out.println("Tamanho do vetor: " + size);

            float[] baseArray = Unidade2.Bucketsort.generateRandomArray(size);
            long totalTime = 0;

            for (int i = 0; i < repetitions; i++) {
                // cria uma cópia para não reordenar o mesmo vetor
                float[] testArray = new float[baseArray.length];
                System.arraycopy(baseArray, 0, testArray, 0, baseArray.length);

                long startTime = System.nanoTime();
                Unidade2.Bucketsort.bucketSort(testArray);
                long endTime = System.nanoTime();

                totalTime += (endTime - startTime);
            }

            double averageTimeNs = (double) totalTime / repetitions;
            double averageTimeMs = averageTimeNs / 1_000_000.0;

            System.out.printf("Tempo médio: %.4f ms (%d repetições)\n\n",
                    averageTimeMs, repetitions);
        }
    }
}

