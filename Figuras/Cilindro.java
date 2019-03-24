package Figuras;

public class Cilindro extends Figura {
    private double radio, altura;
     
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;

        this.setVolumen(this.calcVol());
        this.setSuperficie(this.calcSup());
    }
    
    public double calcVol() {
        double volumen = Math.PI * this.altura * Math.pow(this.radio, 2.0);
        
        return volumen;
    }
    
    public double calcSup() {
        double areaL = 2.0 * Math.PI * this.radio * this.altura;
        double areaB = 2.0 * Math.PI * Math.pow(this.radio, 2.0);
      
        return areaL + areaB;
    }
}