package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] items = new Object[10];
    private int size = 0; // Track the current number of items in the array

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            // If the array is full, double its size
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
        }

        items[size] = item;
        size++; // Increment the size

        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) items[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < size) {
            T item = (T) items[index];

            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }

            size--; // Decrement the size

            return item;
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        if (size == items.length) {
            // If the array is full, double its size
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
        }

        for (int i = size - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        items[index] = item;
        size++; // Increment the size

        return true;
    }

    @Override
    public String toString() {
        return "CustomArrayList [items=" + Arrays.toString(items) + ", size=" + size + "]";
    }
}
