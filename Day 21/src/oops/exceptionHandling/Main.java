package oops.exceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        int a = 6;
        int b = 0;

//        System.out.println(a / b);
        try {
//            System.out.println(a / b);
//            System.out.println(divide(a,b));
//            throw new Exception("fun Zone");
            String name = "vikash";
            if (name.equals("vikash")) {
                throw new MyException("My name is vikash");
            }

        } catch (MyException exception) {
            throw new MyException(exception.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        }finally {
            System.out.println("completed");
        }
    }

    static int divide(int a , int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Do not divide by zero");
        }
        return a / b;
    }
}
