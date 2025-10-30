// Crea un vector con números desordenados.
// Ordena el vector de menor a mayor utilizando el algoritmo de burbuja.
// Imprime el vector ordenado.

import java.util.Random;
public class Ordenamiento {
    public static void main(String[] args) {
        Random random = new Random();
        int tamaño = 8;
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt(100);
        }

        System.out.println("Vector original:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("Vector ordenado de menor a mayor:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
