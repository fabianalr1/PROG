import java.util.Scanner;

void main() {

    IO.println("EJERCICIO 1");

    Scanner sc = new Scanner(System.in);

    IO.println("Introduzca una cantidad de euros: ");
    int cantidad = sc.nextInt();

    int billetes;

    billetes = cantidad / 500;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 500 €");
        cantidad = cantidad % 500;
    }

    billetes = cantidad / 200;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 200 €");
        cantidad = cantidad % 200;
    }

    billetes = cantidad / 100;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 100 €");
        cantidad = cantidad % 100;
    }

    billetes = cantidad / 50;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 50 €");
        cantidad = cantidad % 50;
    }

    billetes = cantidad / 20;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 20 €");
        cantidad = cantidad % 20;
    }

    billetes = cantidad / 10;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 10 €");
        cantidad = cantidad % 10;
    }

    billetes = cantidad / 5;
    if (billetes > 0) {
        IO.println(billetes + " billete(s) de 5 €");
    }
     /* Ejercicio 2: Realiza un programa que muestre un menú
    para sumar, restar, multiplicar, dividir o salir.
    */

    IO.println("EJERCICIO 2");

    int opcion;
    int num1;
    int num2;

    do {
        IO.println("1. Sumar");
        IO.println("2. Restar");
        IO.println("3. Multiplicar");
        IO.println("4. Dividir");
        IO.println("5. Salir");

        IO.println("Elige una opción: ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            IO.println("Introduce el primer número: ");
            num1 = sc.nextInt();

            IO.println("Introduce el segundo número: ");
            num2 = sc.nextInt();

            IO.println("Resultado: " + (num1 + num2));

        } else if (opcion == 2) {
            IO.println("Introduce el primer número: ");
            num1 = sc.nextInt();

            IO.println("Introduce el segundo número: ");
            num2 = sc.nextInt();

            IO.println("Resultado: " + (num1 - num2));

        } else if (opcion == 3) {
            IO.println("Introduce el primer número: ");
            num1 = sc.nextInt();

            IO.println("Introduce el segundo número: ");
            num2 = sc.nextInt();

            IO.println("Resultado: " + (num1 * num2));

        } else if (opcion == 4) {
            IO.println("Introduce el primer número: ");
            num1 = sc.nextInt();

            IO.println("Introduce el segundo número: ");
            num2 = sc.nextInt();

            if (num2 == 0) {
                IO.println("No se puede dividir entre 0");
            } else {
                IO.println("Resultado: " + (num1 / num2));
            }

        } else if (opcion == 5) {
            IO.println("Programa terminado.");

        } else {
            IO.println("Opción no válida.");
        }

    } while (opcion != 5);
}