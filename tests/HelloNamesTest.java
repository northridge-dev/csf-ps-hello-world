import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class HelloNamesTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
      originalOut = System.out;
      System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
      System.setOut(originalOut);
    }

    static Stream<Arguments> provideArgs() {
      return Stream.of(
          Arguments.of((Object) new String[]{"Paladin", "Cavalier"}),
          Arguments.of((Object) new String[]{"Riddervon", "Vytus"})
      );
    }

    @ParameterizedTest
    @DisplayName("Uses two input names and prints 'Hello, <name>' for each on separate lines")
    @MethodSource("provideArgs")
    public void printsHelloNames(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String expected = String.join("\n", java.util.Arrays.stream(args)
            .map(name -> "Hello, " + name)
            .toArray(String[]::new)
            ) + "\n";


        HelloNames.main(args);
        assertEquals(expected, out.toString());
    }
}
