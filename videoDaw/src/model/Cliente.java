package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Cliente {

    private final String DNI;
    private final String nombre;
    private String codSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private boolean peliculasAlquiladas;

    public Cliente(String DNI, String nombre, String codSocio, String direccion,
                   LocalDate fechaNacimiento){

        this.DNI = DNI;
        this.nombre = nombre;
        this.codSocio = codSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.peliculasAlquiladas = new Pelicula[0];
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodSocio() {
        return this.codSocio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public boolean alquilar() {
        if (this.peliculasAlquiladas) {
            return false;
        } else if (this.fechaBaja != null) {
            return false;
        }
        this.peliculasAlquiladas = true;
        this.fechaBaja = LocalDate.now();

        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DNI: ").append(DNI).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("CodSocio: ").append(codSocio).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("FechaNacimiento: ").append(fechaNacimiento).append("\n");
        sb.append("FechaBaja: ").append(fechaBaja).append("\n");
        sb.append("PelÍculas Alquiladas: ");
        sb.append(Arrays.toString(peliculasAlquiladas));

        return sb.toString();
    }
}