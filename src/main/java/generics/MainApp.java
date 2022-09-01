package generics;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        Tests tests = new Tests();

        tests.printSomething(1);
        tests.printSomething("1");
        tests.printSomething(Arrays.asList("1", "2", "3", "4", "5"));




    }
}
