package oops.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Vikash", 89.99f);
        Student student2 = new Student("Raj", 99.08f);
        Student student3 = new Student("Rahul", 89.97f);
        Student student4 = new Student("Rajan", 99.08f);
        Student student5 = new Student("sohan", 87.99f);
        Student student6 = new Student("Ronak", 94.08f);

        Student[] students = {student1,student2,student3,student4,student5,student6};
        System.out.println(Arrays.toString(students));

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.gpa - o2.gpa);
//            }
//        });
        Arrays.sort(students, (o1, o2) -> (int) (o1.gpa - o2.gpa));

        System.out.println(Arrays.toString(students));

//        if (student1.compareTo(student2) < 0) {
//            System.out.println("student2 is having grater than student1");
//        }
    }
}
