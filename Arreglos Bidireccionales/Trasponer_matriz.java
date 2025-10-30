//Transponer una matriz, es decir, convertir filas en columnas.

public class Trasponer_matriz {
    public static void main(String[] args) {
        int[][] M = {
            {10, 2, 3, 25},
            {36, 21, 4, 6},
            {9, 37, 23, 56}
        };

        int filas = M.length;
        int columnas = M[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = M[i][j];
            }
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }    
}
