package ru.geekbrains.java3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitbox = new ArrayList<>();

    public void addFruit(T fruit) {
        fruitbox.add(fruit);
    }
    public float getWeight() {
        float weight = 0;
        for (T f: fruitbox) {
            weight += f.getMass();
        }return weight;
    }

    public boolean compare(Box box) {
        if (getWeight() == box.getWeight()) {
            System.out.println("Коробки равны");
            return true;
        } System.out.println("Коробки разные");
        return false;
    }

    public void pourFruits(Box<T> box) {
        box.fruitbox.addAll(this.fruitbox);
        this.fruitbox.clear();
    }

}
