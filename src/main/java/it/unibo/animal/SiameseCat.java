package it.unibo.animal;

import it.unibo.diet.Carnivore;
import it.unibo.diet.Diet;

public class SiameseCat implements Animal {

    private final double weight;
    private final Diet diet;

    public SiameseCat(final double weight) {
        this.weight = weight;
        this.diet = new Carnivore();
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