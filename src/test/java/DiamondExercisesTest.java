import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiamondExercisesTest {
    @Test
    void should_print_correct_diamond_when_input_3() {
        String except = "  *\n" +
                " ***\n" +
                "Bill\n" +
                " ***\n" +
                "  *";
        int lines = 3;
        String name = "Bill";
        String actual = DiamondExercises.getDiamond(lines, name);
        assertEquals(except, actual);
    }

    @Test
    void should_print_correct_diamond_when_input_4() {
        String except = "   *\n" +
                "  ***\n" +
                " *****\n" +
                "Bill\n" +
                " *****\n" +
                "  ***\n" +
                "   *";
        int lines = 4;
        String name = "Bill";
        String actual = DiamondExercises.getDiamond(lines, name);
        assertEquals(except, actual);
    }
}
