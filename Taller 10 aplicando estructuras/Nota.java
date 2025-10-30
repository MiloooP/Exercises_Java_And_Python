public class Nota {
    public static void main(String[] args) {
        String nota = System.console().readLine("Ingrese el valor del segundo numero:  ");
        double Nota = Double.parseDouble(nota);

        if (Nota <= 3) {
            System.out.println("Reprobado");
        }else if(Nota >= 3 && Nota <= 6){
            System.out.println("En recuperacion");
        }else if (Nota >= 7 && Nota <= 8 ){
            System.out.println("Aprobado");
        }else{
            if (Nota >= 9 && Nota <= 10) {
                System.out.println("Sobresaliente");
            }
        }
    }
}
