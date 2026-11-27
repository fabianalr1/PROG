package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

    private final String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    private final DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    //Constructor
    public Pelicula (String cod, String titulo, Genero genero, LocalDate fechaRegistro,
                     LocalDate fechaBaja, LocalDateTime fechaAlquiler, boolean isAlquilada){

        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaBaja = fechaBaja;
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
    }

    //getters

    public String getCod() {
        return this.cod;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public boolean isAlquilada() {
        return this.isAlquilada;
    }

    public boolean alquilar() {
        if (this.isAlquilada || this.fechaBaja != null){
            return false;
        }

        this.isAlquilada = true;
        this.fechaAlquiler = LocalDateTime.now();

        return true;
    }
    public boolean devolver() {
        if (!this.isAlquilada) {
            return false;
        }

        this.isAlquilada = false;
        this.fechaAlquiler = null;

        return true;
    }
    public boolean darBaja() {
        if (this.isAlquilada || this.fechaBaja !=null) {
            return false;
        }
        this.fechaBaja = LocalDate.now();
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(cod).append("\n");
        sb.append("Titulo: ").append(titulo).append("\n");
        sb.append("Genero: ").append(genero).append("\n");
        sb.append("FechaRegistro: ").append(fechaRegistro).append("\n");
        sb.append("FechaBaja: ").append(fechaBaja).append("\n");

        if (fechaBaja == null) {
            sb.append("Fecha baja: no esta dada de baja \n");
        }else {
            sb.append("Fecha Baja: ").append(this.fechaBaja).append("\n");
        }

        if (fechaAlquiler == null) {
            sb.append("Fecha alquiler: No esta alquilada \n");
        }else {
            sb.append("Fecha Alquiler: ").append(this.fechaAlquiler.format(dtf))
                    .append("\n");
        }
        sb.append("Esta alquilada?: ").append(isAlquilada).append("\n");

        return sb.toString();
    }
}