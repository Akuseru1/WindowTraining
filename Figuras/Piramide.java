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
        double areaB = Math.pow(base, 2);
        
        setVolumen(((areaB * altura) / 3));
    }

    public void calcSup() {
        double areaB = Math.pow(base, 2) , areaL = (4 * base * apotema) / 2;
        
        setSuperficie(areaL + areaB);
    }

}