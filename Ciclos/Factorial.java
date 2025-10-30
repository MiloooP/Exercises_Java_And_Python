//Calcular el factorial de 5 (5! = 1×2×3×4×5).
public class Factorial {
    public static void main(String[] args) {
        String input = System.console().readLine("Ingresa el numero que quieres sacarle el factorial: ");
        int numero = Integer.parseInt(input);
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

