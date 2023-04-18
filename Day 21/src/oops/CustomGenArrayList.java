package oops;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T val) {
        if (isFull(arr)) {
            resize();
        }

        arr[size++] = val;
    }

    private boolean isFull(Object[] arr) {
        return size == arr.length;
    }

    private void resize() {
        Object[] newArray = new Object[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        arr = newArray;
    }

    public T remove() {
        return (T) arr[size--];
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T val) {
        arr[index] = val;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(20);
        list.add(40);
        list.add(50);

        for (int i = 0; i < 16; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}
