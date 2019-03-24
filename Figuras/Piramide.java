package Figuras;

public class Piramide extends Figura {
    private double base, altura, apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;

        this.setVolumen(this.calcVol());
        this.setSuperficie(this.calcSup());
    }

    public double calcVol() {
        double volumen = (Math.pow(this.base, 2.0) * this.altura) / 3.0;

        return volumen;
    }

    public double calcSup() {
        double areaB = Math.pow(this.base, 2.0);
        double areaL = 2.0 * this.base * this.apotema;

        return areaB + areaL;
    }

}