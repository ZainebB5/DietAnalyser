package be.intecbrussel.animal;

import be.intecbrussel.plant.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        System.out.println("Omnivore plant : ");
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
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

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public void makeNoise(){
        System.out.println("omnivore , name : " + getName() + " decibels : " + getDecibel());
    }

    @Override
    public String toString() {
        return getName() ;
    }




}
