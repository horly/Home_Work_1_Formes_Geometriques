package com.company;

/* Home Work 1 Created by ANDELO MATA HORLY and BELABID IKRAM FATIMA ZOHRA on 27/10/2016
  L2 informatique, Groupe 2
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
