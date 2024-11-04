package it.unibo.diet;

/**
 * A [Diet] in which both meat and vegetables can be eaten.
 */
public class Omnivore implements Diet {

    @Override
    public boolean canEatMeat() {
        return true;
    }

    @Override
    public boolean canEatVegetables() {
        return true;
    }
}
