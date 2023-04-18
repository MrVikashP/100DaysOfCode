package cloning;

public class Human implements Cloneable {
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String  name;
    int age;
    int[] arr;

    public Human(String  name, int age) {
        this.name = name;
        this.age = age;
        arr = new int[] {1,2,3,4,5,6};
    }

//    public Human (Human other) {
//        this.name = other.name;
//        this.age = other.age;
//    }


    @Override
    public Human clone() throws CloneNotSupportedException{
        // for non-primitive it will not create new one but will point to the same reference.
        // this is shallow copy
//        return (Human) super.clone();

        // deep copy - creating new array for another object
        Human ram =(Human) super.clone();

        ram.arr = new int[ram.arr.length];

        for (int i = 0; i < ram.arr.length; i++) {
            ram.arr[i] = this.arr[i];

        }

        return ram;
    }
}
