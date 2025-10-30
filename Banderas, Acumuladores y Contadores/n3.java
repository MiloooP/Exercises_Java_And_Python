// Leer 5 números y mostrar la suma total de todos los ingresados.
public class n3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            String entrada = System.console().readLine("Ingrese el número " + (i + 1) + " : ");
            numeros[i] = Integer.parseInt(entrada);
            suma = suma + numeros[i];
        }
        System.out.println("La suma total de todos los numeros dijitados es: " + suma);
    }
}