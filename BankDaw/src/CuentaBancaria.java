import model.Movimiento;
import model.Tipo;

public class CuentaBancaria {

    // Atributos de la cuenta bancaria
    private final String IBAN;
    private final String titular;
    private double saldo = 0;

    // Array para guardar los movimientos
    private final Movimiento[] movimientos1 = new Movimiento[100];
    private int contadorMovimientos = 0;

    // Comprueba si el IBAN es correcto
    public static boolean comprobarIBAN(String IBAN) {

        boolean IBANCorrecto = true;

        if (IBAN == null || IBAN.length() != 24) {
            IBANCorrecto = false;
        } else {

            // Comprobamos que empiece por ES o es
            if (!(IBAN.substring(0, 2).equals("ES")
                    || IBAN.substring(0, 2).equals("es"))) {
                IBANCorrecto = false;
            }

            // Comprobamos que los siguientes 22 caracteres sean numeros
            for (int i = 2; i < 24; i++) {
                if (!Character.isDigit(IBAN.charAt(i))) {
                    IBANCorrecto = false;
                }
            }
        }

        return IBANCorrecto;
    }

    // Constructor
    public CuentaBancaria(String titular, String IBAN) {
        this.titular = titular;
        this.IBAN = IBAN;
    }

    // Getters
    public String getTitular() {
        return this.titular;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Muestra los datos de la cuenta
    public String infoBank() {

        String info = "";

        info += "Titular: " + this.titular + "\n";
        info += "IBAN: " + this.IBAN + "\n";
        info += "Saldo: " + this.saldo + " euros";

        return info;
    }

    // Realiza un ingreso
    public boolean ingreso(double euroIngresado) {

        boolean resultado = false;

        if (euroIngresado > 0 && contadorMovimientos < 100) {

            this.saldo += euroIngresado;
            Movimiento ingreso = new Movimiento(Tipo.INGRESO, euroIngresado);
            this.movimientos1[this.contadorMovimientos] = ingreso;
            this.contadorMovimientos++;

            resultado = true;

            if (euroIngresado > 3000) {
                IO.println("AVISO: Notificar a hacienda");
            }
        }
        return resultado;
    }

    // Realiza una retirada
    public boolean retiro(double euroRetiro) {

        boolean resultado = false;

        if (euroRetiro > 0 && contadorMovimientos < 100
                && this.saldo - euroRetiro >= -50) {

            this.saldo -= euroRetiro;
            Movimiento retiro = new Movimiento(Tipo.RETIRADA, euroRetiro);
            this.movimientos1[this.contadorMovimientos] = retiro;
            this.contadorMovimientos++;

            resultado = true;

            if (this.saldo < 0) {
                IO.println("AVISO: Saldo negativo");
            }

            if (euroRetiro > 3000) {
                IO.println("AVISO: Notificar a hacienda");
            }
        }
        return resultado;
    }

    // Muestra todos los movimientos
    public String mostrarMovimientos() {

        String mostrar = "";

        if (contadorMovimientos == 0) {
            mostrar = "No hay movimientos en la cuenta";
        } else {

            for (int i = 0; i < contadorMovimientos; i++) {

                mostrar += movimientos1[i].mostrarInfoMovimiento();
                mostrar += "--------------------\n";
            }
        }
        return mostrar;
    }
}

