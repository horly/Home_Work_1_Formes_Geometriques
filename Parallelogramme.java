package com.company;

/* Home Work 1 Created by ANDELO MATA HORLY and BELABID IKRAM FATIMA ZOHRA on 27/10/2016
  L2 informatique, Groupe 2
 */

public class Parallelogramme implements Formes{

    protected double hauteur;
    protected double base;
    protected double a;
    protected double b;
    protected double c;

    public Parallelogramme(double hauteur, double base, double a, double b, double c){
        this.hauteur = hauteur;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double air() {
        return base * hauteur;
    }

    @Override
    public double perimetre() {
        return a + b + c + base;
    }

    public static void main(String[] args) {
        Parallelogramme par = new Parallelogramme(2.0, 2.5, 1.0, 2.0, 1.5);

        System.out.println(par.air());
        System.out.println(par.perimetre());
    }
}
