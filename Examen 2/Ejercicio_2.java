public class Ejercicio_2 {
    public static void main(String[] args) {
        String estudiantesInput = System.console().readLine("Ingrese el numero de estudiantes en el grupo: ");
        int numeroEstudiantes = Integer.parseInt(estudiantesInput);

        int i = 1;
        int aprobados = 0;
        int reprobados = 0;
        double sumaTotalNotas = 0;

        while (i <= numeroEstudiantes) {
            String nombre = System.console().readLine("Ingrese el nombre del estudiante " + i + ": ");

            double sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                String notaInput = System.console().readLine("Ingrese la nota " + j + " para " + nombre + ": ");
                double nota = Double.parseDouble(notaInput);
                sumaNotas += nota;
            }

            double promedio = sumaNotas / 3;
            sumaTotalNotas += promedio;

            System.out.println("El promedio de " + nombre + " es: " + promedio);

            if (promedio >= 4.5) {
                System.out.println("El promedio del estudiante " + nombre + " es Exelente.");
                aprobados++;
            } else if (promedio >= 3.0 && promedio < 4.49) {
                System.out.println("El estudiante " + nombre + " a Aprobado.");
                aprobados++;
            } else if (promedio < 3.0) {
                System.out.println("El estudiante " + nombre + " a Reprobado.");
                reprobados++;
            }
            i++;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("1 Mostrar cantidad de estudiantes aprobados");
            System.out.println("2 Mostrar cantidad de estudiantes reprobados");
            System.out.println("3 Mostrar el promedio general del grupo");
            System.out.println("4 Salir del programa");
            String menu = System.console().readLine("Digite que operación le gustaría realizar: ");
            int opciones = Integer.parseInt(menu);

            switch (opciones) {
                case 1:
                    System.out.println("Cantidad de estudiantes aprobados: " + aprobados);
                    break;
                case 2:
                    System.out.println("Cantidad de estudiantes reprobados: " + reprobados);
                    break;
                case 3:
                    double promedioGeneral = 0;
                    if (numeroEstudiantes > 0) {
                        promedioGeneral = sumaTotalNotas / numeroEstudiantes;
                    }
                    System.out.println("El promedio general del grupo es: " + promedioGeneral);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}