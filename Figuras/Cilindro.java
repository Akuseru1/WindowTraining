package Figuras;

import java.lang.Math.*;
public class Cilindro extends Figura {
    private double radio , altura;
     
    Cilindro () {
        
    }
    
    public void calcVol() {
        setVolumen((Math.PI * altura * Math.pow(radio, 2)));
    }
    
    public void calcSup() {
        double areaL , areaB;
       
        areaL = 2 * Math.PI * radio * altura;
        areaB = Math.PI * Math.pow(radio, 2);
        
        setSuperficie((areaL + areaB));
    }
}