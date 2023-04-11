package oops.staticTalks;

public class Engineers { // for a particular organization
    int age;
    String name;
    int salary;

    static int totalEmployee; // since for every one it can be same, can be static

    public Engineers(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;

        Engineers.totalEmployee += 1;
    }
}
