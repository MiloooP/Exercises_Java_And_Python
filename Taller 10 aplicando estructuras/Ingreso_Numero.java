public class Ingreso_Numero {
    public static void main(String[] args){
        String input = System.console().readLine("Escoja la operacion que desea realizar: 1.Suma 2.Resta 3.Multiplicacion 4.Division:  ");
        int Operacion = Integer.parseInt(input);
        String numero1 = System.console().readLine("Ingrese el valor del primer numero:  ");
        String numero2 = System.console().readLine("Ingrese el valor del segundo numero:  ");
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);
        switch (Operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (n1 + n2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (n1 - n2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("El resultado de la division es: " + (n1 / n2));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
            default:
                System.out.println("No es una operacion valida");
                break;
        }
    }
}