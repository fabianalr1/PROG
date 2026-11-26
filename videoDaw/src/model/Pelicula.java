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

    private int contadorPeliculas = 0;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

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

    public void alquilar(){
        this.isAlquilada = true;
        this.fechaAlquiler = LocalDateTime.now();
    }

    public String mostrarInfoPelicula(){
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(this.cod).append("\n");
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Genero: ").append(this.genero).append("\n");
        sb.append("Fecha Registro: ").append(this.fechaRegistro).append("\n");
        sb.append("Fecha Baja: ").append(this.fechaBaja).append("\n");
        sb.append("Fecha alquiler: ").append(this.fechaAlquiler).append("\n");
        sb.append("Is alquilada: ").append(this.isAlquilada).append("\n");

        return sb.toString();
    }

//   @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        sb.append("Código: ").append(cod).append("\n");
//        sb.append("Titulo: ").append(titulo).append("\n");
//        sb.append("Genero: ").append(genero).append("\n");
//        sb.append("FechaRegistro: ").append(fechaRegistro).append("\n");
//        sb.append("FechaBaja: ").append(fechaBaja).append("\n");
//        sb.append("FechaAlquiler: ").append(fechaAlquiler).append("\n");
//        sb.append("IsAlquilada: ").append(isAlquilada).append("\n");
//
//        return sb.toString();
//    }
}