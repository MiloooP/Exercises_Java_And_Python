//Contar cuántos ceros hay en una matriz.

public class Contar_matriz {
        public static void main(String[] args) {
        int[][] M = {
            {10, 0, 3, 0},
            {0, 21, 4, 6},
            {9, 0, 0, 56}
        };

        int contador = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 0) {
                    contador++;
                }
            }
        }
        System.out.println("La cantidad de ceros en la matriz es: " + contador);
    }
}
