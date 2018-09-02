import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class PrimeFactorsExerciseTest {
    @Test
    void should_print_prime_factor_when_length_20() {
        List<Integer> except = Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19);
        int input = 20;
        ArrayList<Integer> actual = PrimeFactorsExercise.getPrimeFactor(input);
        assertIterableEquals(except, actual);
    }

    @Test
    void should_print_prime_factor_when_length_30() {
        List<Integer> except = Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        int input = 30;
        ArrayList<Integer> actual = PrimeFactorsExercise.getPrimeFactor(input);
        assertIterableEquals(except, actual);
    }
}
