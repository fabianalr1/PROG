public abstract class Astros {

     private  double radioEcuatorial;
     private   double rotacion;
     private double masa;
     private  double temperaturaMedia;
     private double gravedad;

    public Astros(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public double getRadioEcuatorial() {
        return this.radioEcuatorial;
    }

    public double getRotacion() {
        return this.rotacion;
    }

    public double getMasa() {
        return this.masa;
    }

    public double getTemperaturaMedia() {
        return this.temperaturaMedia;
    }

    public double getGravedad() {
        return this.gravedad;
    }
    //metodo abstracto obligada a cualquier clase hija
    public abstract String muestra();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RadioEcuatorial: ").append(radioEcuatorial).append("\n");
        sb.append("Rotacion: ").append(rotacion).append("\n");
        sb.append("Masa: ").append(masa).append("\n");
        sb.append("TemperaturaMedia: ").append(temperaturaMedia).append("\n");
        sb.append("Gravedad: ").append(gravedad).append("\n");

        return sb.toString();
    }
}
