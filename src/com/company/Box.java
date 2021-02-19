package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> box = new ArrayList<>();

    //добавить фрукт
    public void addFruits(T fruits) {
        box.add(fruits);
    }

    //Вывести вес
    public float getWeight() {
        float totalWeight = box.size() * box.get(0).getWeight();
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box{" + box +
                '}';
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        }
        return false;
    }

    //Почему он позволил дать доступ к методу addAll() только после конструкции newBox.box, а не сразу к newBox?
    //Долго с этим промучилась, удалось нагуглить, что нужна именно такая конструкция, но до конца не понимаю эту последовательность
    public void changeBox(Box<T> newBox) {
        newBox.box.addAll(0,box);
            this.box.clear();
        }
    }






