package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Cliente {

    private final String DNI;
    private final String nombre;
    private String codSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula[] peliculasAlquiladas;

    // Constructor

    public Cliente(String DNI, String nombre, String codSocio,
                   String direccion, LocalDate fechaNacimiento) {

        if (DNI == null || !DNI.matches("[0-9]{8}[A-Za-z]")) {
            throw new IllegalArgumentException("DNI no válido");
        }

        if (fechaNacimiento == null ||
                Period.between(fechaNacimiento, LocalDate.now()).getYears() < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad");
        }

        this.DNI = DNI;
        this.nombre = nombre;
        this.codSocio = codSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBaja = null;
        this.peliculasAlquiladas = new Pelicula[0];
    }

    // Getters

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

    public LocalDate getFechaBaja() {
        return this.fechaBaja;
    }

    public Pelicula[] getPeliculasAlquiladas() {
        return Arrays.copyOf(this.peliculasAlquiladas,
                this.peliculasAlquiladas.length);
    }

    // Muestra información cliente

    public String mostrarInfoCliente() {
        return this.toString();
    }

    // Mostrar peliculas alquiladas

    public String mostrarPeliculasAlquiladas() {

        StringBuilder sb = new StringBuilder();

        sb.append("Películas alquiladas por ")
                .append(this.nombre).append(":\n");

        if (peliculasAlquiladas.length == 0) {

            sb.append("No tiene películas alquiladas.\n");

        } else {

            for (int i = 0; i < peliculasAlquiladas.length; i++) {

                sb.append(peliculasAlquiladas[i].mostrarInfoPelicula());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    // Agregar pelicula alquilada

    public boolean agregarPeliculaAlquilada(Pelicula p) {

        if (p == null || this.fechaBaja != null) {
            return false;
        }

        for (int i = 0; i < peliculasAlquiladas.length; i++) {

            if (peliculasAlquiladas[i].getCod().equals(p.getCod())) {
                return false;
            }
        }

        peliculasAlquiladas = Arrays.copyOf(
                peliculasAlquiladas,
                peliculasAlquiladas.length + 1
        );

        peliculasAlquiladas[peliculasAlquiladas.length - 1] = p;

        return true;
    }

    // Eliminar pelicula alquilada

    public boolean eliminarPeliculaAlquilada(Pelicula p) {

        if (p == null) {
            return false;
        }

        int posicion = -1;

        for (int i = 0; i < peliculasAlquiladas.length; i++) {

            if (peliculasAlquiladas[i].getCod().equals(p.getCod())) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            return false;
        }

        Pelicula[] nuevoArray =
                new Pelicula[peliculasAlquiladas.length - 1];

        for (int i = 0, j = 0; i < peliculasAlquiladas.length; i++) {

            if (i != posicion) {
                nuevoArray[j] = peliculasAlquiladas[i];
                j++;
            }
        }

        peliculasAlquiladas = nuevoArray;

        return true;
    }

    // Dar de baja cliente

    public boolean darBaja() {

        if (this.fechaBaja != null ||
                peliculasAlquiladas.length > 0) {
            return false;
        }

        this.fechaBaja = LocalDate.now();

        return true;
    }

    // toString

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder();

        sb.append("DNI: ").append(DNI).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Código socio: ").append(codSocio).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Fecha nacimiento: ").append(fechaNacimiento).append("\n");

        if (fechaBaja == null) {
            sb.append("Fecha baja: No está dado de baja\n");
        } else {
            sb.append("Fecha baja: ").append(fechaBaja).append("\n");
        }

        sb.append("Películas alquiladas: ")
                .append(Arrays.toString(peliculasAlquiladas));

        return sb.toString();
    }
}