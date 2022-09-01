package patterns.singleton;


public class TestServiceMultiThread {

    private static volatile TestServiceMultiThread instance;
    private String value;

    private TestServiceMultiThread(String value) {
        this.value = value;
    }

    public static TestServiceMultiThread getInstance(String value) {
        final TestServiceMultiThread testService = instance;
        if(testService != null) {
            return testService;
        }
        synchronized (TestServiceMultiThread.class) {
            if (instance == null) {
                instance = new TestServiceMultiThread(value);
            }
            return instance;
        }
    }

    public String getValue() {
        return value;
    }

}
