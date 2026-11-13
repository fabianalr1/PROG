import model.Movimiento;
import model.Tipo;

public class CuentaBancaria {

    private final String IBAN;
    private final String titular;
    private double saldo = 0;
    private final Movimiento [] movimientos1 = new Movimiento[100];
    private int contadorMovimientos = 0;

    public CuentaBancaria (String Titular, String IBAN){
        this.titular = Titular;
        this.IBAN = IBAN;
    }
        public String getTitular() { return this.titular; }

        public String getIBAN() { return this.IBAN; }

        public double getSaldo() {
            return this.saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String infoBank() {
            String infoBank = "";
            infoBank += "Titular: " + this.titular + "\n";
            infoBank += "IBAN: " + this.IBAN + "\n";
            infoBank += "Saldo: " + this.saldo + "\n";

            return infoBank;
        }
        public boolean ingreso (boolean euroIngreso){
        boolean resultado = false;

    }
}

