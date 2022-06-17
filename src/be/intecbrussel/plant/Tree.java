package be.intecbrussel.plant;

import be.intecbrussel.plant.LeafType;
import be.intecbrussel.plant.Plant;

public class Tree extends Plant {
    private LeafType leafType;

    /*public enum LeafType{
        NEEDLE, ROUND, HAND, HEART, SPEAR;
    }*/

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    /*@Override
    public String toString() {
        return getName() +
                " : " + leafType ;
    }*/
}
