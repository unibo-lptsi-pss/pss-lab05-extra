package it.unibo.diet;

/**
 * A [Diet] in which only plants can be eaten.
 */
public class Herbivore implements Diet {

    @Override
    public boolean canEatMeat() {
        return false;
    }

    @Override
    public boolean canEatVegetables() {
        return true;
    }
}
