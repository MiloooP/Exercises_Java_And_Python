public class Plataforma {
    public static void main(String[] args) {
        String input1 = System.console().readLine("¿Tienes el usuario activo? (true/false): ");
        boolean usuarioActivo = Boolean.parseBoolean(input1);
        String input2 = System.console().readLine("¿Tienes deuda pendiente? (true/false): ");
        boolean tieneDeuda = Boolean.parseBoolean(input2);
        if (usuarioActivo && !tieneDeuda) {
            System.out.println("Puedes ingresar a la plataforma");
        } else {
            System.out.println("No puedes ingresar a la plataforma.");
        }
    }
}
