package be.intecbrussel.plant;

public class Bush extends Plant {
    private LeafType leafType;
    private String fruit;

    /*public enum LeafType{
        NEEDLE, ROUND, HAND, HEART, SPEAR;
    }*/

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }


}
