package oops.staticTalks;

public class Main {
    public static void main(String[] args) {
        Engineers engineer1 = new Engineers(22, "vikash", 20000);
        Engineers engineer2 = new Engineers(23, "anand", 16000);
        Engineers engineer3 = new Engineers(24, "tom", 20000);

        System.out.println(Engineers.totalEmployee); // static belong to class

        greet();

//        message(); // cannot be accessed since it is not static and main is static so both differs

        Main msg = new Main();
        msg.message(); // now it can be used since it is used via its instance.


    }

    static void greet() {

    }

    void message() {
        greet(); // static ones can be used in the not static, because at the end it is called by static members.

    }
}
