package oops.staticTalks;

// outer class can not be static it is not dependable on any other classes
public class InnerClasses {

    // Inner class may be static anc may not be static.
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test test = new Test("vikash");
        Test test2 = new Test("rahul");

        System.out.println(test.name);
        System.out.println(test2.name);


        Test2 test3 = new Test2("rahul");
        Test2 test4 = new Test2("vikash");

        System.out.println(test3.name);
        System.out.println(test4.name);
    }
}

class Test2 {
    static String name;

    public Test2(String name) {
        Test2.name = name;
    }

}

