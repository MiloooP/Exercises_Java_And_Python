//Imprimir una matriz de manera formateada.

public class Matriz_Formateada {
    public static void main(String[] args) {
        int[][] M = {
            {10, 2, 3, 25},
            {36, 21, 4, 6},
            {9, 37, 23, 56}
        };

        imprimirMatrizFormateada(M);
    }

    public static void imprimirMatrizFormateada(int[][] matriz) {
        System.out.println("=== MATRIZ FORMATEADA ===");

        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("+-----");
        }
        System.out.println("+");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("| %3d ", matriz[i][j]);
            }
            System.out.println("|");

            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print("+-----");
            }
            System.out.println("+");
        }
    }
}
