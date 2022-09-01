package patterns.singleton;


public class TestService {

    private static TestService instance;
    private String value;

    private TestService (String value) {
        this.value = value;
    }

    public static TestService getInstance(String value){
        if(instance == null) {
            instance = new TestService(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

}
