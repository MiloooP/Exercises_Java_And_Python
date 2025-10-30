// Leer 10 números enteros e indicar: La suma total de todos los números (acumulador).
// La cantidad de números pares (contador).
// Si se ingresó al menos un número negativo (bandera).
public class n4 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int suma = 0;
        int Pares = 0;
        boolean Numero_Negativo = false;

        for (int i = 0; i < 10; i++) {
            String entrada = System.console().readLine("Ingrese el numero " + (i + 1) + " : ");
            numero[i] = Integer.parseInt(entrada);
            suma = suma + numero[i];

            if (numero[i] % 2 == 0) {
                Pares++;            
            } 
            if (numero[i] < 0) {
                Numero_Negativo = true;
            } 
        }   
        System.out.println("La suma total es: "+ suma);
        System.out.println("La cantidad de numeros pares es: "+ Pares);
        
        if (Numero_Negativo) {
            System.out.println("Se ingreso al menos un numero negativo");
        } else {
            System.out.println("No se ingreso ningun numero negativo");
        }
    }
}


