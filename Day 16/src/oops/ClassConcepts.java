package oops;

public class ClassConcepts {
    public static void main(String[] args) {
        Student student1; // declaring which happens at compile time
        student1 = new Student(); // creating objects which happens at runtime. dynamic memory allocation

//        System.out.println(student1.name);
        // in the above line, since we do not change the name and try to print it then it shows the default value of the
        // data type which is defined in the classes.
        // it means it first checks that whether any value of name is present in the object if present then use it
        // otherwise go to its class means where it is instantiated and use the default ones.

//        student1.name = "Vikash Pandey";
//        student1.roll = 46;
//        student1.marks = 69.99f;

        System.out.println(student1.name);
        System.out.println(student1.roll);
        System.out.println(student1.marks);

        Student student2 = new Student(11, "Awnish", 99.00f);
        System.out.println(student2.name);

        student2.changeName("pandey");
        System.out.println(student2.name);

        Student student3 = new Student(student1);

        System.out.println(student3.name);

        final Student student4 = new Student();
        // when any object becomes final it means only values in that object be changed but cannot assign it to another objects
        student4.name = "default person";

        System.out.println(student4.name);

//        student4 = student2; // Cannot assign a value to final variable 'student4'


    }
}

class Student {
    int roll;
    String name;
    float marks;

    public Student() {
        // calling another constructor
        this(46, "Vikash Pandey", 100.00f);

    }

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void changeName (String changeName) {
        this.name = changeName;
    }

    public Student (Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }
}
