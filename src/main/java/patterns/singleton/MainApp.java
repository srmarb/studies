package patterns.singleton;

public class MainApp {

    public static void main(String[] args) {
        TestService testService = TestService.getInstance("AAA");
        TestService testService2 = TestService.getInstance("BBB");

        System.out.println(testService.getValue());
        System.out.println(testService2.getValue());

        //o valor deve ser o mesmo, mesmo criando dois objetos

    }
}
