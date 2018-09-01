class FizzBuzzExercise {
    static String[] getFizzBuzz(int lenght) {
        String[] fizzBuzz = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            fizzBuzz[i] = sayNumber(i + 1);
        }
        return fizzBuzz;
    }

    private static String sayNumber(int number) {
        String word = "";
        String stringNumber = String.valueOf(number);
        word += threeMultiple(number) + fiveMultiple(number);
        if (word.equals("")) {
            return stringNumber;
        }
        return word;
    }

    private static String threeMultiple(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }

    private static String fiveMultiple(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }
}
