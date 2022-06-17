package be.intecbrussel.animal;

import be.intecbrussel.plant.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet  = new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public void printDiet(){
        System.out.println("Herbivore plant : " + getPlantDiet());

    }

    @Override
    public String toString() {
        return  getName();
    }

    @Override
    public void makeNoise(){
        System.out.println("herbivore , name : " + getName() + " decibels : " + getDecibel());
    }
}
