package oops;

import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int val) {
        if (isFull(arr)) {
            resize();
        }

        arr[size++] = val;
    }

    private boolean isFull(int[] arr) {
        return size == arr.length;
    }

    private void resize() {
        int[] newArray = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        arr = newArray;
    }

    public int remove() {
        return arr[size--];
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int val) {
        arr[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(20);;
        list.add(30);;
        list.add(50);

        for (int i = 0; i < 15; i++) {
            list.add(2*i);
        }

        System.out.println(list);

    }
}
