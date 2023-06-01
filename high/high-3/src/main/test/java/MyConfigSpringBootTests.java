import com.example.utka.MyConfigSpringBoot;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = MyConfigSpringBoot.class)
@EnableConfigurationProperties(MyConfigSpringBoot.class)
public class MyConfigSpringBootTests {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Autowired
    MyConfigSpringBoot myConfigSpringBoot;

    @Test
    public void testProperties_ClassExist_ExpectedResult() {
        assertEquals("Dima", myConfigSpringBoot.getName());
        assertEquals(456, myConfigSpringBoot.getValue());
    }
}