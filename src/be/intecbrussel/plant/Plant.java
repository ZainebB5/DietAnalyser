package be.intecbrussel.plant;

import java.util.Objects;

public class Plant implements Comparable<Plant>{
    //public class
    private String name;
    private double height;
    private Colour colour;

    public enum Colour {
        RED, BLUE, GREEN, YELLOW, BROWN;

    }

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(name, plant.name) && colour == plant.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour);
    }

    @Override
    public int compareTo(Plant o) {
        return this.getName().compareTo(o.getName());
    }


}




