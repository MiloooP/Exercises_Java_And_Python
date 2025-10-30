// Leer 6 números e indicar si hay algún número mayor a 100.
public class n1 {
    public static void main(String[] args) {
        int[] numeros = new int[6];

        for (int i = 0; i < 6; ++i){
            String entrada = System.console().readLine("Ingrese un numero " + (i + 1) + " : ");
            numeros[i] = Integer.parseInt(entrada);
        }

        int mayores_a_100 = 0;

        for (int i = 0; i < 6; ++i){
            if (numeros[i] > 100){
                mayores_a_100++;
            }
        }
        System.out.println("Cantidad de numeros mayores a 100 son " + mayores_a_100 + " numeros de 6");
    }
}