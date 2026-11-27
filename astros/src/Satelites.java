public class Satelites extends Astros{

    private double distanciaPlanetaria;
    private double orbitaPlanetaria;
    private Planetas planeta;

    public Satelites(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad,
                     double distanciaPlanetaria, double orbitaPlanetaria, Planetas planeta) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaPlanetaria = distanciaPlanetaria;
        this.orbitaPlanetaria = distanciaPlanetaria;
        this.planeta = planeta;
    }

    public double getDistanciaPlanetaria() {
        return this.distanciaPlanetaria;
    }

    public double getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public Planetas getPlaneta() {
        return this.planeta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DistanciaPlanetaria: ").append(distanciaPlanetaria).append("\n");
        sb.append("OrbitaPlanetaria: ").append(orbitaPlanetaria).append("\n");
        sb.append("Planeta: ").append(planeta).append("\n");

        return sb.toString();
    }

    @Override
    public String muestra() {
        return super.toString() + this.toString();
    }
}