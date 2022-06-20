package be.intecbrussel.plant;

import java.util.Comparator;

public class CompareColour implements Comparator<Plant.Colour> {


    @Override
    public int compare(Plant.Colour o1, Plant.Colour o2) {
        return o1.compareTo(o2);
    }
}
