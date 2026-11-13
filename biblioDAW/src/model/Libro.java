package model;

public class Libro {
    //Contador estatico propio de la clase
    private static int contadorTotal = 0;

    //Atributos de la clase

    private final int contador;
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private String genero;
    private String fechaPublicacion;

    //constructores

    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
        this.contador = contadorTotal;
        contadorTotal++;
    }

    public Libro(String isbn, String titulo, String autor, int nPaginas, String editorial,
                 String genero, String fechaPublicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;

        this.contador = contadorTotal;
        contadorTotal++;
    }

    /*Definimos las propiedades: getters y setters
     */

    public String getIsbn(){
        return this.isbn;
    }

    public int getContador(){
        return this.contador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial(){
        return  this.editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getFechaPublicacion(){
        return this.fechaPublicacion;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getnPaginas() {
        return this.nPaginas;
    }

    public void setnPaginas(int nPaginas){
        this.nPaginas = nPaginas;
    }

    //metodo para obtener toda la informacion de un libro
    public String infoLibro(){
        String infoLibro = "";

        infoLibro += "Contador: " + this.contador + "\n";
        infoLibro += "Titulo: " + this.titulo + "\n";
        infoLibro += "Autor: " + this.autor + "\n";
        infoLibro += "ISBN: " + this.isbn + "\n";
        infoLibro += "Genero: " + this.genero + "\n";
        infoLibro += "Fecha de Publicacion: " + this.fechaPublicacion + "\n";
        infoLibro += "Editorial: " + this.editorial + "\n";
        infoLibro += "NPaginas: " + this.nPaginas + "\n";

        return infoLibro;
    }


}
