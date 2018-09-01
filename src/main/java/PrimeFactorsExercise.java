import java.util.ArrayList;

class PrimeFactorsExercise {
    static ArrayList<Integer> getPrimeFactor(int number) {
        ArrayList<Integer> primeFactor = new ArrayList<>();
        if (number < 1) {
            throw (new IllegalArgumentException());
        }
        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == 2) {
                primeFactor.add(i);
            } else if (isPrime(i)) {
                primeFactor.add(i);
            }
        }
        return primeFactor;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
