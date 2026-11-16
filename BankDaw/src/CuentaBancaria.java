import model.Movimiento;
import model.Tipo;

public class CuentaBancaria {

    //atributos de la clase
    private final String IBAN;
    private final String titular;
    private double saldo = 0;

    //atributos de la clase Movimientos
    private final  Movimiento [] movimientos1 = new Movimiento[100];
    private int contadorMovimientos = 0;

    //constructores
    public CuentaBancaria (String Titular, String IBAN){
        this.titular = Titular;
        this.IBAN = IBAN;
    }

    //Getters y setters de los atributos
        public String getTitular() {
        return this.titular;
        }

        public String getIBAN() {

        return this.IBAN;
        }

        public double getSaldo() {

        return this.saldo;
        }

        public void setSaldo(double saldo) {

        this.saldo = saldo;
        }

        private void saldo(int length) {
        }

        //información mostrada
        public String infoBank() {
            String infoBank = "";
            infoBank += "Titular: " + this.titular + "\n";
            infoBank += "IBAN: " + this.IBAN + "\n";
            infoBank += "Saldo: " + this.saldo + "\n";

            return infoBank;
        }

        public boolean ingreso (boolean euroIngresado){
        boolean resultado = false;

        if ( euroIngresado ) {
            this.saldo += euroIngresado;
            Movimiento ingreso = new Movimiento(Tipo.INGRESO euroIngresado);
            this.movimientos1 [this.contadorMovimientos] = ingreso;
            this.contadorMovimientos++;
            resultado = true;
            }
            return resultado;
        }

        public boolean retiro (boolean euroRetiro){
        boolean resultadoo = false;

        if ( euroRetiro ) {
            this.saldo -=  euroRetiro;
            Movimiento retiro = new Movimiento(Tipo.RETIRADA euroRetiro);
            this.movimientos1 [this.contadorMovimientos] = retiro;
            this.contadorMovimientos--;
            resultadoo = true;
        }
        return resultadoo;
    }

}

