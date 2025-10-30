//Declara dos variables numéricas
//(con el valor que desees), muestra por consola la suma,
//resta, multiplicación, división y módulo (resto de la división).

public class java {
    public static void main(String[] args) {
        String numero_1 = System.console().readLine("dijite el primer numero  ");
        int numeros_1 = Integer.parseInt(numero_1);
        String numero_2 = System.console().readLine("dijite el segundo numero  ");
        int numeros_2 = Integer.parseInt(numero_2);

        double sum = numeros_1 + numeros_2;
        double res = numeros_1 - numeros_2;
        double mul = numeros_1 * numeros_2;
        double div = numeros_1 / numeros_2;
        double mod = numeros_1 % numeros_2;

        System.out.println("las suma de los dos numeros es:  " + sum );
        System.out.println("las resta de los dos numeros es:  " + res );
        System.out.println("las multiplicacion de los dos numeros es:  " + mul );
        System.out.println("las divicion de los dos numeros es:  " + div );
        System.out.println("las modulo de los dos numeros es:  " + mod );

    }
    
}
