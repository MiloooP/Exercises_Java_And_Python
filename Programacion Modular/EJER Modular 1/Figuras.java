//Crea un módulo llamado geometría con funciones para calcular el área y perímetro de diversas 
//figuras (círculo, triángulo, cuadrado, rectángulo).
//En un programa principal, importa el módulo y permite al usuario
//seleccionar la figura y proporcionar los datos necesarios para realizar los cálculos.

public class Figuras {

    public static double Areacirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);        
    }
    public static double PerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public static double PerimetroTriangulo(double l1, double l2, double l3) {
        return l1 + l2 + l3;
    }

    public static double Areacuadrado(double lado) {
        return lado * lado;
    }

    public static double PerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double AreaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    public static double PerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
}
