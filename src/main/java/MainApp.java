import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {
/*
        List<String> listString = Arrays.asList("a", "b", "d", "f", "y");

        System.out.println(listString);
        System.out.println("Filter: ");
        System.out.println(listString.stream().filter(item -> item.equals("y") || item.equals("b")).collect(Collectors.toList()));
        System.out.println("------------------------------------------------");

        List<String> listString2 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y");
        System.out.println(listString2);
        System.out.println("Distinct: ");
        System.out.println(listString2.stream().distinct().collect(Collectors.toList()));
        System.out.println("------------------------------------------------");

        List<String> listString3 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y");
        System.out.println(listString3);
        System.out.println("Sort: ");
        System.out.println(listString3.stream().sorted().collect(Collectors.toList()));
        System.out.println("------------------------------------------------");

        List<String> listString4 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y");
        System.out.println(listString4);
        System.out.println("Sort and Distinct: ");
        System.out.println(listString4.stream().distinct().sorted().collect(Collectors.toList()));
        System.out.println("------------------------------------------------");

        List<String> listString5 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y");
        System.out.println(listString5);
        System.out.println("ForEach: ");
        listString2.stream().forEach(item -> System.out.println(item));
        System.out.println("------------------------------------------------");

        List<String> listString6 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y");
        System.out.println(listString6);
        System.out.println("AllMatch: !s.isEmpty()");
        System.out.println(listString6.stream().allMatch(item -> !item.isEmpty()));
        List<String> listString7 = Arrays.asList("a", "b", "d", "f", "y", "a", "a", "y", "y", "");
        System.out.println(listString7);
        System.out.println(listString7.stream().allMatch(item -> !item.isEmpty()));
        System.out.println("------------------------------------------------");

        List<Pessoa> listPessoas = Arrays.asList(new Pessoa(10, "test"),
                                               new Pessoa(11, "test"),
                                               new Pessoa(15, "test"),
                                               new Pessoa(16, "test"),
                                               new Pessoa(10, "test"),
                                               new Pessoa(17, "test"),
                                               new Pessoa(18, "test"),
                                               new Pessoa(19, "test"));
        System.out.println(listPessoas);
        System.out.println("Filter objects with age > 18: ");
        System.out.println(listPessoas.stream().filter(pessoa -> pessoa.getAge() > 17).collect(Collectors.toList()));

        System.out.println("OrElse with success: ");
        System.out.println(listPessoas.stream().map(pessoa -> pessoa.getAge() == 18).findFirst().orElse(null));

        System.out.println("OrElse with fail: ");
        //var x = listPessoas.stream().

        Map<String, Object> mapTest = new HashMap<>();
        mapTest.put("teste", "12345");
*/

        Pessoa pessoa = new Aluno();
        pessoa.getAge();




    }



}
