 //Declara 2 variables numéricas (con el valor que desees), 
 //he indica cual es mayor de los dos.
 //Si son iguales indicarlo también. 
 //Ves cambiando los valores para comprobar que funciona.
public class java_1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            String mostrar = System.console().readLine("Dijite un numero  ");
            int numero = Integer.parseInt(mostrar);
            String mostrar2 = System.console().readLine("Dijite un numero  ");
            int numero2 = Integer.parseInt(mostrar2);
            if(numero >= numero2){
                System.out.println("el numero " + numero + " es mayor");
            } else {
                System.out.println("el numero " + numero + " es menor");
            }
        }
    }
}