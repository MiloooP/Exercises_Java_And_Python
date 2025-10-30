// Leer 8 números y mostrar cuántos de ellos son múltiplos de 5.
public class n2 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < 8; ++i) {
            String entrada = System.console().readLine("Ingrese el nuemro " + (i + 1) + ":  ");
            numeros[i] = Integer.parseInt(entrada);
        }

        int multiplos_de_5 = 0;
        for(int i = 0; i < 8; ++i){
            if (numeros[i] % 5 == 0) {
                multiplos_de_5++;
            }
        }
        System.out.println("Los numeros multiplos de cinco son: " + multiplos_de_5 + " numeros de 8");   
    }
}