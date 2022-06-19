package be.intecbrussel.nature.app;

import be.intecbrussel.*;
import be.intecbrussel.animal.Animal;
import be.intecbrussel.animal.Carnivore;
import be.intecbrussel.animal.Herbivore;
import be.intecbrussel.animal.Omnivore;
import be.intecbrussel.plant.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        ForestNoteBook noteBook = new ForestNoteBook();
        Tree eik = new Tree("Eik");
        eik.setLeafType(LeafType.HAND);
        eik.setColour(Plant.Colour.BLUE);
        Flower flower = new Flower("Floflo");
        flower.setSmell(Flower.Scent.ERTHY);
        flower.setColour(Plant.Colour.RED);
        Bush bush = new Bush("Aardbeien boom");
        bush.setLeafType(LeafType.NEEDLE);
        bush.setFruit("Aardbei");
        bush.setColour(Plant.Colour.GREEN);
        Flower jasmin = new Flower("Jasmin");
        jasmin.setSmell(Flower.Scent.MUSKY);
        flower.setColour(Plant.Colour.YELLOW);
        Tree pijBoom = new Tree("Pijnboom");
        pijBoom.setLeafType(LeafType.HEART);
        pijBoom.setColour(Plant.Colour.BROWN);

        noteBook.addPlant(eik);
        noteBook.addPlant(flower);
        noteBook.addPlant(bush);
        noteBook.addPlant(bush);
        noteBook.addPlant(jasmin);
        noteBook.addPlant(pijBoom);

        System.out.println("number of plant : " + noteBook.getPlantCount());

        Omnivore poo = new Omnivore("Winny");
        poo.setDecibel(55);
        Carnivore croco = new Carnivore("Croco");
        croco.setDecibel(25);
        Herbivore bugs = new Herbivore("Bugs Bunny");
        bugs.setDecibel(60);
        Carnivore croco2 = new Carnivore("Zroco");
        croco2.setDecibel(34);
        Omnivore jolly = new Omnivore("Jolly jumper");
        jolly.setDecibel(76);
        Carnivore moufassa = new Carnivore("Moufassa");
        moufassa.setDecibel(23);
        Herbivore titi = new Herbivore("Titi");
        titi.setDecibel(12);
        Carnivore grosMinet = new Carnivore("Grominet");
        grosMinet.setDecibel(6);
        Herbivore bourriquet = new Herbivore("Bourriquet");
        bourriquet.setDecibel(45);

        noteBook.addAnimal(poo);
        noteBook.addAnimal(poo);
        noteBook.addAnimal(croco);
        noteBook.addAnimal(bugs);
        noteBook.addAnimal(croco2);
        noteBook.addAnimal(jolly);
        noteBook.addAnimal(moufassa);
        noteBook.addAnimal(titi);
        noteBook.addAnimal(grosMinet);
        noteBook.addAnimal(bourriquet);

        System.out.println("number of animal : " + noteBook.getAnimalCount());

        noteBook.printNotebook();

        System.out.println("* Animals sort byname *");
        noteBook.sortAnimalsByName();

        System.out.println("* Plant sort byname *");
        noteBook.sortPlantsByName();

        System.out.println("* Sort byColour * ");
        noteBook.sortPlantsByColour();

        Animal animalHeigh = new Animal("Toto" , 51);
        Plant plantHeigh = new Plant("Wind ose", 43);

        noteBook.printNotebook();

        /*System.out.println("--".repeat(29));
        Collections.sort(noteBook.getAnimals());
        Collections.reverse(noteBook.getAnimals());*/
        System.out.println("* Animals from loudest to least * ");
        noteBook.getAnimals().stream()
                .sorted(Comparator.comparing(Animal::getDecibel).reversed())
                .forEach(System.out::println);
        System.out.println("* Animals above 50 decibels *");
        noteBook.getAnimals().stream()
                .filter(a -> a.getDecibel() > 50 )
                .forEach(System.out::println);















    }
}
