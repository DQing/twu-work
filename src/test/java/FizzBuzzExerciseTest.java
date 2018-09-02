import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExerciseTest {
    @Test
    void should_print_correct_fizz_buzz_when_input_15() {
        String[] except = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        int number = 15;
        String[] actual = FizzBuzzExercise.getFizzBuzz(number);
        assertArrayEquals(except, actual);
    }

    @Test
    void should_print_correct_fizz_buzz_when_input_10() {
        String[] except = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz"};
        int number = 10;
        String[] actual = FizzBuzzExercise.getFizzBuzz(number);
        assertArrayEquals(except, actual);
    }
}
