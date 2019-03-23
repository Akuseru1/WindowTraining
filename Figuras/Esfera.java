package Figuras;

import java.lang.Math.*;
public class Esfera extends Figura {
    private double radio;

    Esfera() {

    }

    public void cacVol() {
        setVolumen(((4 / 3) * Math.PI * Math.pow(radio, 3)));
    }

    public void calcSup() {
        setSuperficie((4 * Math.PI * Math.pow(radio, 2)));
    }
}