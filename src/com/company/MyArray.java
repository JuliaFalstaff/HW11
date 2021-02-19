package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray<T> {
    private T[] array;

    public MyArray(T... array) {
        this.array = array;
    }

    // Метод конвертации массива в ArrayList
    public void changeArrayToArrayList(){
        List<T> list = Arrays.asList(array);
        System.out.println(list);
    }



}






