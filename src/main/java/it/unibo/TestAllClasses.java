package it.unibo;

import it.unibo.animal.*;

public class TestAllClasses {
    public static void main(String[] args) {
        Animal kangaroo = new Kangaroo(50.0);
        Animal korat = new KoratCat(4.0);
        Animal siamese = new SiameseCat(7.0);
        Animal squirrel = new Squirrel(0.60);

        // Test the canEat method
        // everything should print true
        System.out.println(!kangaroo.canEat(korat));
        System.out.println(korat.canEat(squirrel));
        System.out.println(!siamese.canEat(kangaroo));
        System.out.println(!squirrel.canEat(korat));
    }
}
