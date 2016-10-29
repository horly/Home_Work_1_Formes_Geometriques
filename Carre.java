package com.company;

/* Home Work 1 Created by ANDELO MATA HORLY and BELABID IKRAM FATIMA ZOHRA on 27/10/2016
  L2 informatique, Groupe 2
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
