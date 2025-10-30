import java.util.Scanner;
public class BusquedaFrutas {
    public static void main(String[] args) {
        String[] frutas = {
            "Manzana", "Pera", "Kiwi", "Uva", "Naranja",
            "Melón", "Sandía", "Fresa", "Cereza", "Mango"
        };
        System.out.println("-----------------------");
        System.out.println("-  Búsqueda de Frutas -");
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Manzana");
        System.out.println("Pera");
        System.out.println("Kiwi");
        System.out.println("Uva");
        System.out.println("Naranaja");
        System.out.println("Melon");
        System.out.println("Sandia");
        System.out.println("Fresa");
        System.out.println("Cereza");
        System.out.println("Mango");
        System.out.println("---------------------------------------");
        System.out.print("Ingrese el nombre de la fruta a buscar: ");
        String frutaBuscada = scanner.nextLine().trim();

        if (frutaBuscada.isEmpty()) {
            System.out.println("No ingresó ninguna fruta");
            scanner.close();
            return;
        }

        boolean encontrada = false;
        for (int i = 1; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(frutaBuscada)) {
                System.out.println("La fruta " + frutas[i] + " se encuentra en la posición " + i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println(" La fruta " + frutaBuscada + " no se encuentra en el vector");
        }
        scanner.close();
    }
}
