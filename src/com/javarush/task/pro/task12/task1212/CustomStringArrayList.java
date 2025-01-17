package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        String[] oldElements = elements.clone();

        size = 0;
        capacity = (int) (elements.length * 1.5);
        elements = new String[capacity];

        for (int i = 0; i < oldElements.length; i++) {
            elements[i] = oldElements[i];
        }
    }

}
