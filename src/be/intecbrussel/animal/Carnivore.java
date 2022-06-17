package be.intecbrussel.animal;

import be.intecbrussel.animal.Animal;

public class Carnivore extends Animal {
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }



    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        if (maxFoodSize >= 50){
            System.out.println("Too big to be eat !");
        }else {
            this.maxFoodSize = maxFoodSize;
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void makeNoise(){
        System.out.println("carnivore , name : " + getName() + " decibels : " + getDecibel());
    }
}
