import java.util.Scanner;
public class Ejerc12 {
    public static void main(String[] args){
        // Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
        //con distintas opciones:
        //a. Mostrar valores.
        //b. Introducir valor.
        //c. Salir.
        //La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
        //posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
        //que el usuario elija la opción ‘c’ que terminará el programa

        Scanner teclado = new Scanner(System.in);

            int[] numeros = new int[10];
            String opcion;

            do {
                IO.println("MENU");
                IO.println("a. Mostrar valores");
                IO.println("b. Introducir valor");
                IO.println("c. Salir");
                IO.println("Elige una opcion:");
                opcion = teclado.next();

                switch (opcion) {
                    case "a":
                        for (int i = 0; i < numeros.length; i++) {
                            IO.println("Posicion " + i + ": " + numeros[i]);
                        }
                        break;

                    case "b":
                        IO.println("Introduce un valor:");
                        int V = teclado.nextInt();

                        IO.println("Introduce una posicion entre 0 y 9:");
                        int P = teclado.nextInt();

                        if (P >= 0 && P < numeros.length) {
                            numeros[P] = V;
                            IO.println("Valor introducido correctamente.");
                        } else {
                            IO.println("Posicion no valida.");
                        }
                        break;

                    case "c":
                        IO.println("Fin del programa.");
                        break;

                    default:
                        IO.println("Opcion no valida.");
                }
            } while (!opcion.equals("c"));
        }
    }
