package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Shelf[] shelfes = new Shelf[2];
        shelfes[0] = new Shelf(200,300,200);
        shelfes[1] = new Shelf(200,300,200);
	    Sopha soph = new Sopha(shelfes,2);
	    soph.getPolkas()[0].TryVpihnut
                (new Box
                        (400,400,400)
                );
    }
}