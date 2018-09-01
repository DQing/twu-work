import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExerciseTest {
    @Test
    void should_print_correct_fizz_buzz() {
        String[] except = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        int number = 15;
        String[] actual = FizzBuzzExercise.getFizzBuzz(number);
        assertArrayEquals(except, actual);
    }
}
