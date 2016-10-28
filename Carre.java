package com.company;

/**
 * Created by Andelo Mata Horly on 26/10/2016.
 */


public class Carre implements Formes
{
    protected double cote;

    public Carre(double cote)
    {
        this.cote = cote;
    }

    @Override
    public double air()
    {
        return Math.pow(cote, 2);
    }

    @Override
    public double perimetre()
    {
        return cote * 4;
    }

    public static void main(String[] args)
    {
        Carre ca = new Carre(2.0);

        System.out.println(ca.air());
        System.out.println(ca.perimetre());

    }
}
