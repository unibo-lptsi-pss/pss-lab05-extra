package it.unibo.diet;

/**
 * A [Diet] in which only meat can be eaten.
 */
public class Carnivore implements Diet {

    @Override
    public boolean canEatMeat() {
        return true;
    }

    @Override
    public boolean canEatVegetables() {
        return false;
    }
}
