package patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonMultiThreadTest {

    @Test
    public void whenCreateTwoInstancesThenResultIsTheSame() {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.run();
        threadB.run();
    }

}

class ThreadA implements Runnable {
    @Override
    public void run() {
        TestServiceMultiThread testService = TestServiceMultiThread.getInstance("AAA");
        Assertions.assertTrue("AAA".equals(testService.getValue()));
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        TestServiceMultiThread testService2 = TestServiceMultiThread.getInstance("BBB");
        Assertions.assertTrue("AAA".equals(testService2.getValue()));
    }
}