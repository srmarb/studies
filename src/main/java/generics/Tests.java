package generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tests {

    public <T> void printSomething(T that){
        if(that instanceof String) {
            System.out.println("String : " + that);
        }
        if (that instanceof Integer) {
            System.out.println("Integer : " + that);
        }

        if (that instanceof List<?>) {
            ((List<?>) that).stream().forEach(
                    System.out::println
            );
        }

    }

    public <T> List<T> fromArrayToList(T[] s) {
        return Arrays.stream(s).collect(Collectors.toList());
    }

}
