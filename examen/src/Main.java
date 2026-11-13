import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Debe de pedir la cantidad total de números a almacenar al iniciar el programa.
        // Debe de generar un menú con la siguiente estructura:
        // Modificar colección:
        // Insertar número.
        // Borrar número de una posición específica
        // Modificar número de una posición específica.
        // Estadísticas de la colección:
        // Media de todos los valores no nulos.
        // Suma de todos los valores.
        // Máximo de la colección
        // Mínimo de la colección
        // Ampliar el valor de la colección.
        // Salir
        Scanner teclado = new Scanner(System.in);
        IO.println("Introduzca la cantidad total de números: ");
        String opcion = "3";

        int cantidad = 0;
        int insertarNum = 0;
        int cantidadNumero = teclado.nextInt();
        do {
            Scanner Sc = new Scanner(System.in);
            IO.println("Modificar colección: ");
            IO.println(" 1. Insertar número: ");
            IO.println(" 2. Borrar número de una posición específica: ");
            IO.println(" 3. Modificar número de una posición específica: ");

            opcion = Sc.nextLine();
 
            switch (opcion){
                case "1" ->{
                    Sc = new Scanner(System.in);
                    System.out.print("Inserte número: " + insertarNum );
                }
                case "2" ->{
                    Sc = new Scanner(System.in);
                    IO.println( "Borrar número" + cantidadNumero);
                }
                case "3" ->{
                    Sc = new Scanner(System.in);
                    IO.println("Modifica número de una posición específica" + cantidad);
                }
                default -> IO.println("El modificar colección llego a su fin");
            }
        }while (!opcion.equals("3"));

        teclado = new Scanner(System.in);
        double suma = 0.0 , media = 0.0 , max = Double.MAX_VALUE , min = Double.MAX_VALUE;
        int[] ampliarNumero = new int[20];
        String opcion2 = "5";

        do {
            Scanner sc = new Scanner(System.in);
            IO.println("Estadisticas de colección");
            IO.println(" A. Media de los números no nullos ");
            IO.println(" B. Suma de todos los valores");
            IO.println(" C. Maximo de la colección ");
            IO.println(" D. Minimo de la colección ");
            IO.println(" E. Ampliar valor de la colección ");
            IO.println(" F. Salir ");

            switch (opcion2) {
                case "A" -> {
                    sc = new Scanner(System.in);
                    IO.println("Media de los números: " + media);
                }
                case "B" -> {
                    sc = new Scanner(System.in);
                    IO.println("La suma de los valores " + suma);
                }
                case "C" -> {
                    sc = new Scanner(System.in);
                    IO.println("El valor maximo es: " + max);
                }
                case "D" -> {
                    sc = new Scanner(System.in);
                    IO.println("El valor minimo es: " + min);
                }
                case "E" -> {
                    sc = new Scanner(System.in);
                    IO.println("Ampliar el valor de la colección" + ampliarNumero) ;
                }
                case "F" -> {
                    sc = new Scanner(System.in);
                    IO.println("El programa se cerrara");
                }
                default -> IO.println("Opción no permitida, introduzca una opción entre a y f");
            }
        }while (!opcion.equals("5"));
    }
}