package com.company;

/* Home Work 1 Created by ANDELO MATA HORLY and BELABID IKRAM FATIMA ZOHRA on 27/10/2016
  L2 informatique, Groupe 2
 */


public class Triangle implements Formes {

    protected double hauteur;
    protected double base;
    protected double a;
    protected double b;

    public Triangle(double hauteur, double base, double a, double b){
        this.hauteur = hauteur;
        this.base = base;
        this.a = a;
        this.b = b;
    }

    @Override
    public double air() {
        return (base * hauteur)/2;
    }

    @Override
    public double perimetre() {
        return a + b + base;
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle(2.0, 3.5, 1.0, 1.5);

        System.out.println(tri.air());
        System.out.println(tri.perimetre());
    }
}
