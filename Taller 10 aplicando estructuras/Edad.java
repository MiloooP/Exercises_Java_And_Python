public class Edad {
    public static void main(String[] args) {     
        String input = System.console().readLine("Ingresa tu edad: ");
        int edad = Integer.parseInt(input);
        
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
    }
}
