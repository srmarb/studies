package patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void whenCreateTwoInstancesThenResultIsTheSame() {
        TestService testService = TestService.getInstance("AAA");
        TestService testService2 = TestService.getInstance("BBB");
        Assertions.assertTrue("AAA".equals(testService.getValue()));
        Assertions.assertTrue("AAA".equals(testService2.getValue()));
    }

}
