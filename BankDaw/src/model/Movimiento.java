package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private static int contadorMovimientos = 0;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //atributos de la clase
    private final String id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    //constructores
    public Movimiento (String id, LocalDateTime fecha,  Tipo tipo, double cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = contadorMovimientos;
        contadorMovimientos++;
    }

    public String getId() {
        return this.id;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(double  cantidad) {
        this.cantidad = cantidad;
    }

    public String infoMovimiento(){
        String mostrarInfoMovimiento = "";
        mostrarInfoMovimiento += "ID: " + this.id + "\n";
        mostrarInfoMovimiento += "Fecha: " + this.fecha.format(formatter) + "\n";
        mostrarInfoMovimiento += "Tipo: " + this.tipo.name() + "\n";
        mostrarInfoMovimiento += "Cantidad: " + this.cantidad + "\n";

        return mostrarInfoMovimiento;
    }
}
