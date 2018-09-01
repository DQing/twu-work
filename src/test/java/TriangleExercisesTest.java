import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleExercisesTest {

    @Test
    void should_print_correct_when_input_3() {
        String except = "*\n" +
                "**\n" +
                "***";
        int lines = 3;
        String actual = TriangleExercises.getTriangle(lines);
        assertEquals(except, actual);
    }

    @Test
    void should_print_correct_when_input_4() {
        String except = "*\n" +
                "**\n" +
                "***\n" +
                "****";
        int lines = 4;
        String actual = TriangleExercises.getTriangle(lines);
        assertEquals(except, actual);
    }
}
