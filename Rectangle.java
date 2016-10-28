package com.company;

/**
 * Created by Andelo Mata Horly on 26/10/2016.
 */

public class Rectangle implements Formes {

    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur)
    {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    @Override
    public double air() {
        return longueur * largeur;
    }

    @Override
    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(2.5, 1.5);

        System.out.println(rec.air());
        System.out.println(rec.perimetre());
    }
}