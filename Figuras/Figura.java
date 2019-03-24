package Figuras;

public class Figura {
    private double volumen, superficie;

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getVolumen() {
        return this.volumen;
    }
    public double getSuperficie() {
        return this.superficie;
    }
    
    public String toString() {
        return "Volumen: " + String.format("%10.3f", this.volumen) + " cms^3\nArea: " + String.format("%10.3f", this.superficie) + " cms^2\n";
    }
}