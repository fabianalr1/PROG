package model;

import java.time.LocalDate;

public class VideoDaw {

    private final String CIF;
    private String direccion;
    private LocalDate fechaAlta;
    private Pelicula[] peliculasRegistradas;
    private Cliente[] clientesRegistrados;

    private int contadorPeliculas;
    private int contadorClientes;

    public VideoDaw(String CIF, String direccion, LocalDate fechaAlta){

        this.CIF = CIF;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.peliculasRegistradas = new Pelicula [0];
        this.clientesRegistrados = new Cliente [0];
    }

    public String getCIF() {
        return this.CIF;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public String mostrarInfoVideoDaw(){
        StringBuilder sb = new StringBuilder();
        sb.append("CIF: ").append(this.CIF).append("\n");
        sb.append("Dirección: ").append(this.direccion).append("\n");
        sb.append("Fecha alta: ").append(this.fechaAlta).append("\n");

        return sb.toString();
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        sb.append("CIF: ").append(CIF).append("\n");
//        sb.append("Dirección: ").append(direccion).append("\n");
//        sb.append("Fecha Alta: ").append(fechaAlta).append("\n");
//        sb.append("Películas Registradas: ").append(Arrays.toString(peliculasRegistradas));
//        sb.append("Clientes registrados: ").append(Arrays.toString(clientesRegistrados));
//
//        return sb.toString();
//    }
}
