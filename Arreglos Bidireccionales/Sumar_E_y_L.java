//Sumar los elementos de cada fila de una matriz y devolver una lista con las sumas.

public class Sumar_E_y_L {
        public static void main(String[] args) {
        int[][] M = {
            {10, 2, 3, 25},
            {36, 21, 4, 6},
            {9, 37, 23, 56}
        };

        System.out.println("Suma de los elementos de cada fila:");

        for (int i = 0; i < M.length; i++) {
            int suma = 0;
            for (int j = 0; j < M[i].length; j++) {
                suma += M[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + suma);
        }
    }
}