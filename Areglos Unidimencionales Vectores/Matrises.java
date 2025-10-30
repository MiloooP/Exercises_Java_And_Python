//Crea una matriz de 3x3, donde cada elemento sea el resultado de sumar sus índices. 
//Imprime la matriz por pantalla.

import java.util.Random;
public class Matrises {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = i + x + random.nextInt(10);
            }
        }

        System.out.println("Matriz (índices + número aleatorio):");
        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz[i].length; x++) {
                System.out.print(matriz[i][x] + "\t");
            }
            System.out.println();
        }
    }
}
