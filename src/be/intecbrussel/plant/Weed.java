package be.intecbrussel.plant;

import be.intecbrussel.plant.Plant;

public class Weed extends Plant {
    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
