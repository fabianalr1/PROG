package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    // Contador para generar los ID de los movimientos
    private static int contadorMovimientos = 1;

    // Formato de la fecha
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Atributos de la clase
    private final int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private double cantidad;

    // Constructor
    public Movimiento(Tipo tipo, double cantidad) {

        // Asigna un ID diferente a cada movimiento
        this.id = contadorMovimientos;
        contadorMovimientos++;

        // Guarda la fecha actual
        this.fecha = LocalDateTime.now();

        // Guarda el tipo y la cantidad
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // Getters
    public int getId() {
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

    // Muestra toda la información del movimiento
    public String mostrarInfoMovimiento() {

        String mostrarInfoMovimiento = "";

        mostrarInfoMovimiento += "ID: " + this.id + "\n";
        mostrarInfoMovimiento += "Fecha: " + this.fecha.format(formatter) + "\n";
        mostrarInfoMovimiento += "Tipo: " + this.tipo.name() + "\n";
        mostrarInfoMovimiento += "Cantidad: " + this.cantidad + " euros\n";

        return mostrarInfoMovimiento;
    }
}
