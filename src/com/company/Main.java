package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Задание 1

        String[] array = {"a", "b", "c", "d"};
        replaceElements(array,0,1);


        //Задание 2 (сделала универсальный метод для массивов: для теста 2 массива - int и String).

        MyArray<Integer> array2 = new MyArray<>(1,2,3,4);
        array2.changeArrayToArrayList();

        MyArray<String> array3 = new MyArray<>("one", "two", "three", "four");
        array3.changeArrayToArrayList();


        //Задание 3:

        Apple apple1 = new Apple("Яблоко",1.0f);
        Apple apple2 = new Apple("Яблоко",1.0f);
        Apple apple3 = new Apple("Яблоко",1.0f);
        Apple apple4 = new Apple("Яблоко",1.0f);
        Orange orange1 = new Orange("Апельсин",1.5f);
        Orange orange2 = new Orange("Апельсин",1.5f);


        //Коробка яблок
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        appleBox.addFruits(apple1);
        appleBox.addFruits(apple2);
        appleBox.addFruits(apple3);
        appleBox.addFruits(apple4);
        System.out.println(appleBox);
        float totalWeightApples = appleBox.getWeight();
        System.out.println("Вес коробки с яблоками = " + totalWeightApples);

//        Коробка апельсинов
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruits(orange1);
        orangeBox.addFruits(orange2);
        System.out.println(orangeBox);
        float totalWeightOranges = orangeBox.getWeight();
        System.out.println("Вес коробки с апельсинами = " + totalWeightOranges);

        //Сравнение коробок
        System.out.println("Результат сравнения веса коробок равен - " + appleBox.compare(orangeBox));

        //Пересыпать фрукты в другую коробку
        appleBox.changeBox(appleBox2);
        System.out.println(appleBox2);
        System.out.println(appleBox);

    }

//     Поменять элементы массива местами
    public static <T> void replaceElements(T [] array, int indexFirst, int indexSecond){
        T temporaryElement =  array[indexFirst];
        array[indexFirst] = array[indexSecond];
        array[indexSecond] = temporaryElement;
        System.out.println(Arrays.toString(array));
    }






}
