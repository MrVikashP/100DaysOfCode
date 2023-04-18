package oops.comparing;

public class Student implements Comparable<Student>{
    private String name;
    float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("Method Called");

        return (int) (this.gpa - o.gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
