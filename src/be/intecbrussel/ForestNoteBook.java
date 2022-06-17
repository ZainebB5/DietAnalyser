package be.intecbrussel;

import be.intecbrussel.animal.Animal;
import be.intecbrussel.animal.Carnivore;
import be.intecbrussel.animal.Herbivore;
import be.intecbrussel.animal.Omnivore;
import be.intecbrussel.plant.Plant;

import java.util.*;


public class ForestNoteBook {
    private List<Animal> animals;
    private List<Plant> plants ;
    private List<Carnivore> carnivores ;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;

    public ForestNoteBook() {
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores(){
        carnivores = new ArrayList<>();
        if (animals == null) {
            System.out.println("List is null");
        }
        if (animals.isEmpty()) {
            System.out.println("List is empty");
        }
        for (Animal a : animals) {
                if (a.getClass().equals(Carnivore.class)) {
                    carnivores.add((Carnivore) a);
                }
            }

        return carnivores;
    }

    public List<Omnivore> getOmnivores(){
        omnivores = new ArrayList<>();
        for (Animal a : animals) {
            if (a.getClass().equals(Omnivore.class)) {
                omnivores.add((Omnivore) a);
            }
        }
        return omnivores;
    }

    public List<Herbivore> getHerbivores(){
        herbivores = new ArrayList<>();
        for (Animal a : animals) {
            if (a.getClass().equals(Herbivore.class)) {
                herbivores.add((Herbivore) a);
            }
        }
        return herbivores;
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public int getPlantCount(){
        plantCount = plants.size();
        return plantCount;
    }

    public int getAnimalCount(){
        animalCount = animals.size();
        return animalCount;
    }

    public void printNotebook(){
        System.out.println("Plant : " +  plants + "\nOmnivore : " + getOmnivores() + "\nHerbivore : " + getHerbivores() + "\nCarnivore : " + getCarnivores());
    }

    public void addAnimal(Animal animal){
        if (animals != null){
            if (!animals.contains(animal)) {
                animals.add(animal);
            }
            for (Animal a : animals){
                if (a.getName().equals(animal)){
                    animals.remove(a);
                }
            }
        }

    }

    public void addPlant(Plant plant){
       if (plants != null) {
           if (!plants.contains(plant)) {
               plants.add(plant);
           }
           for (Plant p : plants) {
               if (p.getName().equals(plant)) {
                   if (!plants.contains(plant)) {
                       plants.remove(p);
                   }
               }
           }
       }
    }


    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
        System.out.println(animals);
        /*SortedSet<Animal> sortedAnimals = new TreeSet<Animal>(animals);
        sortedAnimals.stream()
                .sorted(Comparator.comparing(Animal::getName));
        System.out.println(sortedAnimals);*/

    }

    public void sortPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));
        System.out.println(plants);
         /*Collections.sort(plants);
        for (int i = 0; i < plants.size();i++){
            System.out.println(plants.get(i));
        }*/
    }

    public void sortPlantsByColour(){
        plants.stream().sorted(Comparator.comparing(Plant::getColour));
        System.out.println();

    }


    @Override
    public String toString() {
        return "ForestNoteBook{" +
                "plants=" + plants +
                ", carnivores=" + getCarnivores() +
                ", omnivores=" + getOmnivores() +
                ", herbivores=" + getHerbivores() +
                '}';
    }

}
