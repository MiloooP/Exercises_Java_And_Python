public class Tienda {
    public static void main(String[] args) {
        String input = System.console().readLine("Ingresa el valor total de la compra: ");
        double compra = Double.parseDouble(input);
        double descuento = compra * 0.10;
        if (compra > 200000) {
            descuento = compra * 0.10; // Calculo del descunto de 10% = 10/100 = 0,10
        }
        double valorFinal = compra - descuento;
        System.out.println("El valor del descuento es: " + descuento);
        System.out.println("El valor final a pagar es: " + valorFinal);
    }
}

