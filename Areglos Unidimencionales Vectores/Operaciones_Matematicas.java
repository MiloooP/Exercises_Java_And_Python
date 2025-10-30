//Crea dos vectores de 5 elementos cada uno, con números enteros aleatorios. 
//Suma elemento a elemento ambos vectores y almacena el resultado en un nuevo vector. 
//Calcula el producto punto de ambos vectores. 

import java.util.Random;
public class Operaciones_Matematicas {
    public static void main(String[] args) {
        Random random = new Random();
        int tamaño = 5;

        int[] A = new int[tamaño];
        int[] B = new int[tamaño];
        int[] suma = new int[tamaño];

        int productoPunto = 0;

        for (int i = 0; i < tamaño; i++) {
            A[i] = random.nextInt(10);
            B[i] = random.nextInt(10);
        }

        for (int i = 0; i < tamaño; i++) {
            suma[i] = A[i] + B[i];
            productoPunto += A[i] * B[i];
        }

        System.out.println("Vector A: ");
        System.out.println("\t");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nVector B: ");
        System.out.println("\t");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nSuma elemento a elemento (A + B): ");
        System.out.println("\t");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(suma[i] + " ");
        }

        System.out.println("\n\nProducto punto de A y B: " + productoPunto);        
    }
}

