
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TaskTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));

    }

    @DisplayName("Проверка на точное количество повторений каждого имени")
    @Test
    public void correctNumbersOfNames() {
        Task.testFun(Task.caseNames);
        checkNames();
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

    void checkNames() {
        Assertions.assertTrue(output.toString().contains("alla = 3"));
        Assertions.assertTrue(output.toString().contains("felix = 1"));
        Assertions.assertTrue(output.toString().contains("alex = 2"));
        Assertions.assertTrue(output.toString().contains("den = 1"));
        Assertions.assertTrue(output.toString().contains("fillip = 1"));
    }
}
