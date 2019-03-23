public class Piramide extends Figura {
    private double base, altura, apotema;

    public Piramide() {

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