import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    @DisplayName("Prints 'Hello, World'")
    public void printsHelloWorld() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld.main(new String[]{});
        assertEquals("Hello, World\n", out.toString());
    }
}
