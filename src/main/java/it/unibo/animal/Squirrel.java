package it.unibo.animal;


import it.unibo.diet.Diet;
import it.unibo.diet.Omnivore;

public class Squirrel implements Animal {

    private final double weight;
    private final Diet diet;

    public Squirrel(final double weight) {
        this.weight = weight;
        this.diet = new Omnivore();
    }

    @Override
    public boolean canEat(final Animal animal) {
        return this.diet.canEatMeat() && (animal.getWeight() < this.getWeight());
    }

    @Override
    public boolean canEatVegetables() {
        return this.diet.canEatVegetables();
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
