package Figuras;

import java.lang.Math.*;
public class Cilindro extends Figura {
    private double radio , altura;
     
    public Cilindro (double radio,double altura) {
        this.radio = radio;
        this.altura = altura;
        calcVol();
        calcSup();
    }
    
    public void calcVol() {
        setVolumen((Math.PI * altura * Math.pow(radio, 2.0)));
    }
    
    public void calcSup() {
        double areaL = 2.0 * Math.PI * radio * altura , areaB = 2.0 * Math.PI * Math.pow(radio, 2.0);
      
        setSuperficie((areaL + areaB));
    }
}