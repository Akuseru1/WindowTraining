package Figuras;

public class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;

        this.setVolumen(this.calcVol());
        this.setSuperficie(this.calcSup());
    }

    public double calcVol() {
        double volumen = 1.33333333 * Math.PI * Math.pow(this.radio, 3.0);
        
        return volumen;
    }

    public double calcSup() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        
        return superficie;
    }
    
    public String toString() {
        return "ESFERA\nRadio: " + this.radio + " cms\n" + super.toString();
    }
}