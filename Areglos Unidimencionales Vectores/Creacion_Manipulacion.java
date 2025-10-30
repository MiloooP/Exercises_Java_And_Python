//Crea un vector que contenga los primeros 10 números naturales. 
//Agrega los números 15 y 20 al final del vector. 
//Imprime el tercer elemento del vector. 
//Invierte el orden de los elementos del vector y muestra el resultado. 

public class Creacion_Manipulacion {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("- Creacion y Manipulacion de Vectores -");
        System.out.println("---------------------------------------");
        int[] numeros = new int[12];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }

        numeros[10] = 15;
        numeros[11] = 20;

        System.out.println("El tercer elemento del vector es: " + numeros[2]);
        System.out.println("Numero agregado: "+ numeros[10]);
        System.out.println("Numero agregado: "+ numeros[11]);

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.print("Vector invertido: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
