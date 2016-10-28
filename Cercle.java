package com.company;

/**
 * Created by Andelo Mata Horly on 26/10/2016.
 */

public class Cercle implements Formes {

    protected double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    @Override
    public double air() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double perimetre() {
        return (2 * (Math.PI))* rayon;
    }

    public static void main(String[] args) {
        Cercle cer = new Cercle(2.0);

        System.out.println(cer.air());
        System.out.println(cer.perimetre());
    }
}
