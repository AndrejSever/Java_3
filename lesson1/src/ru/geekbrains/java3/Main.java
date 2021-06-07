package ru.geekbrains.java3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1: ");
	Integer[] array1 = {1, 2, 6, 8, 10, 5, 9};
	try {
	    SwapsArray(array1, 3, 4);
    } catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Не верно введены значения для элементов перестановки");
    }
	String[] array2 = {"L", "A", "D", "A" };
	try {
	    SwapsArray(array2, 0, 2);
    } catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Не верно введены значения для элементов перестановки");
    }

    System.out.println("Задание №2: ");
	conversionToArrayList(array1);

    System.out.println("Задание №3: ");

    Box<Apple> appleBox1 = new Box<>();
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    appleBox1.addFruit(new Apple());
    System.out.println("Вес коробки с яблоками №1: " + appleBox1.getWeight());

     Box<Apple> appleBox2 = new Box<>();
    appleBox2.addFruit(new Apple());
    appleBox2.addFruit(new Apple());
    appleBox2.addFruit(new Apple());
    appleBox2.addFruit(new Apple());
    System.out.println("Вес коробки с яблоками №2: " + appleBox2.getWeight());
    appleBox2.compare(appleBox1);
    appleBox1.pourFruits(appleBox2);
    System.out.println("Вес коробки с яблоками №1: " + appleBox1.getWeight());
    System.out.println("Вес коробки с яблоками №2: " + appleBox2.getWeight());

    Box<Orange> orangeBox1 = new Box<>();
    orangeBox1.addFruit(new Orange());
    orangeBox1.addFruit(new Orange());
    orangeBox1.addFruit(new Orange());
    System.out.println("Вес коробки с апельсинами №1: " + orangeBox1.getWeight());

    Box<Orange> orangeBox2 = new Box<>();
    orangeBox2.addFruit(new Orange());
    orangeBox2.addFruit(new Orange());
    orangeBox2.addFruit(new Orange());
    orangeBox2.addFruit(new Orange());
    System.out.println("Вес коробки с апельсинами №2: " + orangeBox2.getWeight());

    appleBox1.compare(orangeBox1);
    orangeBox1.pourFruits(orangeBox2);
    System.out.println("Вес коробки с апельсинами №2: " + orangeBox2.getWeight());

    }

public static  <T> void SwapsArray(T[] array, int a , int b) {
        System.out.println(Arrays.toString(array));
        T arrayA = array[a];
        array[a] = array[b];
        array[b] = arrayA;
        System.out.println(Arrays.toString(array));
    }

    public static <T> void conversionToArrayList(T[] array) {
        ArrayList arrayList = new ArrayList();
        for (T a: array) {
            arrayList.add(a);
        }
        System.out.println(arrayList);
    }





}
