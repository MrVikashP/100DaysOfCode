package oops.packageTalks.test1; // in which package this class is.

import static oops.packageTalks.test2.Message.message; // other package properties are being used

public class Greeting { // same class name present in package test2

     void greeting () {
        System.out.println("Hello Vikash");

        // using methods that is defined in other class.
        message();
    }
}
