import java.util.Scanner;
import model.Movimiento;
import model.Tipo;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables para guardar los datos de la cuenta
        String titular;
        String IBAN = "";

        // Pedimos los datos al usuario
        IO.println("Bienvenido a DawBank");

        IO.print("Introduce el nombre del titular: ");
        titular = sc.nextLine();

        // Pedimos el IBAN hasta que sea correcto
        boolean IBANCorrecto = false;

        while (IBANCorrecto == false) {

            IO.print("Introduce el IBAN: ");
            IBAN = sc.nextLine();

            if (CuentaBancaria.comprobarIBAN(IBAN)) {
                IBANCorrecto = true;
            } else {
                IO.println("IBAN incorrecto. Vuelve a introducirlo.");
            }
        }

        int opcion = 0;

        // El menu se repite hasta elegir salir
        CuentaBancaria cuenta = new CuentaBancaria(titular, IBAN);
        while (opcion != 8) {

            IO.println("\n----- MENU DawBank -----");
            IO.println("1. Datos de la cuenta");
            IO.println("2. IBAN");
            IO.println("3. Titular");
            IO.println("4. Saldo");
            IO.println("5. Ingreso");
            IO.println("6. Retirada");
            IO.println("7. Movimientos");
            IO.println("8. Salir");

            IO.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    IO.println(cuenta.infoBank());
                    break;

                case 2:
                    IO.println("IBAN: " + cuenta.getIBAN());
                    break;

                case 3:
                    IO.println("Titular: " + cuenta.getTitular());
                    break;

                case 4:
                    IO.println("Saldo: " + cuenta.getSaldo() + " euros");
                    break;

                case 5:
                    IO.print("Cantidad que quieres ingresar: ");
                    double ingreso = sc.nextDouble();

                    if (cuenta.ingreso(ingreso)) {
                        IO.println("Ingreso realizado correctamente");
                    } else {
                        IO.println("No se ha podido realizar el ingreso");
                    }
                    break;

                case 6:
                    IO.print("Cantidad que quieres retirar: ");
                    double retiro = sc.nextDouble();

                    if (cuenta.retiro(retiro)) {
                        IO.println("Retirada realizada correctamente");
                    } else {
                        IO.println("No se ha podido realizar la retirada");
                    }
                    break;

                case 7:
                    IO.println(cuenta.mostrarMovimientos());
                    break;

                case 8:
                    IO.println("Gracias por utilizar DawBank");
                    break;

                default:
                    IO.println("Opción no valida");
            }
        }

        sc.close();
    }
}