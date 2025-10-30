//Encontrar el elemento máximo en una matriz.

public class Elemento_maximo {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 2, 3, 25},
            {36, 100, 4, 6},
            {9, 37, 23, 56}
        };

        int mayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {              
            for (int j = 0; j < matriz[i].length; j++) {       
                if (matriz[i][j] > mayor) {                    
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("El elemento máximo en la matriz es: " + mayor);
    }
}
