package Figuras;

import java.lang.Math.*;
public class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        calcVol();
        calcSup();
    }

    public void calcVol() {
        setVolumen(((4 / 3) * Math.PI * Math.pow(radio, 3)));
    }

    public void calcSup() {
        setSuperficie((4 * Math.PI * Math.pow(radio, 2)));
    }
}