package Figuras;

public class Piramide extends Figura {
    private double base, altura, apotema;

    public Piramide(double base,double altura,double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        calcVol();
        calcSup();
    }

    public void calcVol() {
        double areaB = Math.pow(base, 2.0);
        
        setVolumen(((areaB * altura) / 3.0));
    }

    public void calcSup() {
        double areaB = Math.pow(base, 2.0) , areaL = (4.0 * base * apotema) / 2.0;
        
        setSuperficie(areaL + areaB);
    }

}