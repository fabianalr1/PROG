import java.time.LocalDate;

public class Persona {

    private String Nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona (String nombre, String apellidos, LocalDate fechaNacimiento, String dni){

        this.Nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;

    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getDni() {
        return this.dni;
    }

    public String infoPersona(){

        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.Nombre).append("\n");

    }
}
