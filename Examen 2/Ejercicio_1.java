public class Ejercicio_1 {
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("1 Sumar ");
            System.out.println("2 Restar ");
            System.out.println("3 MUltiplicar ");
            System.out.println("4 Dividir ");
            System.out.println("5 Salir ");
            String menu = System.console().readLine("Dijitie que operacion le gustaria realizar: ");
            int opciones = Integer.parseInt(menu);

            switch (opciones) {
                case 1:
                    String numero1 = System.console().readLine("Dijite el primer numero: ");
                    double num1 = Double.parseDouble(numero1);
                    String numero2 = System.console().readLine("Dijite el segundo numero: ");
                    double num2 = Double.parseDouble(numero2);
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    String numero3 = System.console().readLine("Dijite el primer numero: ");
                    double num3 = Double.parseDouble(numero3);
                    String numero4 = System.console().readLine("Dijite el segundo numero: ");
                    double num4 = Double.parseDouble(numero4);
                    System.out.println("El resultado de la resta es: " + (num3 - num4));
                    break;
                case 3:
                    String munero5 = System.console().readLine("Dijite el un numero: ");
                    double num5 = Double.parseDouble(munero5);
                    String numero6 = System.console().readLine("Dijite el otro numero: ");
                    double num6 = Double.parseDouble(numero6);
                    System.out.println("El resultado de la multiplicacion es: " + (num5 * num6));
                    break;
                case 4:
                    String numero7 = System.console().readLine("Dijite el un numero: ");
                    double num7 = Double.parseDouble(numero7);
                    String numero8 = System.console().readLine("Dijite el otro numero: ");
                    double num8 = Double.parseDouble(numero8);

                    if (num8 != 0) {
                        System.out.println("El resultado de la division es: " + (num7 / num8));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar la calculadora");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}