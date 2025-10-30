public class Cajero {

    public static void main(String[] args) {
        double saldo = Double.parseDouble(System.console().readLine("Deposite su saldo inicial  "));
        System.out.println("1 Consultar saldo");
        System.out.println("2 Retirar dinero");
        System.out.println("3 Depositar dinero");
        String input = System.console().readLine("Escoga una de las anteriores opciones  ");
        int opciones = Integer.parseInt(input);
        switch (opciones) {
        case 1:
            System.out.println("Saldo disponible " + saldo);
            break;

        case 2:
            String Retirar = System.console().readLine("Cuanto dinero deseea retirar  ");
            double retirar = Double.parseDouble(Retirar);
            if (retirar > saldo){
                System.out.println("El monto a retirar es mayor al saldo por favor dijite un monto valido  ");
            } else {
            System.out.println("Dinero retirado con exito");
        }
            break;
        case 3:
            String Depositar = System.console().readLine("Cunto dinero desea depositar  ");
            double depositar = Double.parseDouble(Depositar);
            System.out.println("Dinero depositado con exito " + depositar);
            System.out.println("Su nuevo saldo es " + (saldo + depositar));
            break;
        default:
            System.out.println("Opcion no valida");
            break;
        }
    }  
}