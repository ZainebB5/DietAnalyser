package be.intecbrussel.plant;

public class Flower extends Plant {
    private Scent smell;

    public enum Scent{
        SWEET, ORANGE, PINEAPPLE, MUSKY, ERTHY, SOUR;
    }

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

}
