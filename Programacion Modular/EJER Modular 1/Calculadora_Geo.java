import java.util.Scanner;
public class Calculadora_Geo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionFigura, opcionOperacion;

        System.out.println("=== CÁLCULO DE ÁREA Y PERÍMETRO ===");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Triángulo");
        System.out.print("Elige una figura: ");
        opcionFigura = sc.nextInt();

        System.out.println("\n¿Qué deseas calcular?");
        System.out.println(" ");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        System.out.print("Opción: ");
        opcionOperacion = sc.nextInt();

        double resultado = 0;

        switch (opcionFigura) {
            case 1:
                System.out.print("\nIngresa el radio: ");
                double radio = sc.nextDouble();
                if (opcionOperacion == 1)
                    resultado = Figuras.Areacirculo(radio);
                else
                    resultado = Figuras.PerimetroCirculo(radio);
                break;

            case 2:
                System.out.print("\nIngresa el lado: ");
                double lado = sc.nextDouble();
                if (opcionOperacion == 1)
                    resultado = Figuras.Areacuadrado(lado);
                else
                    resultado = Figuras.PerimetroCuadrado(lado);
                break;

            case 3:
                System.out.print("\nIngresa la base: ");
                double base = sc.nextDouble();
                System.out.print("Ingresa la altura: ");
                double altura = sc.nextDouble();
                if (opcionOperacion == 1)
                    resultado = Figuras.AreaRectangulo(base, altura);
                else
                    resultado = Figuras.PerimetroRectangulo(base, altura);
                break;

            case 4:
                if (opcionOperacion == 1) {
                    System.out.print("\nIngresa la base: ");
                    double b = sc.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double h = sc.nextDouble();
                    resultado = Figuras.AreaTriangulo(b, h);
                } else {
                    System.out.print("\nIngresa el lado 1: ");
                    double l1 = sc.nextDouble();
                    System.out.print("Ingresa el lado 2: ");
                    double l2 = sc.nextDouble();
                    System.out.print("Ingresa el lado 3: ");
                    double l3 = sc.nextDouble();
                    resultado = Figuras.PerimetroTriangulo(l1, l2, l3);
                }
                break;

            default:
                System.out.println("Opción no válida.");
                sc.close();
                return;
        }

        System.out.println("\nEl resultado es: " + resultado);
        sc.close();
    }
}
