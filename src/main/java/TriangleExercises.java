class TriangleExercises {
    static String getTriangle(int lines) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append("*");
            }
            if (i != lines) {
                triangle.append("\n");
            }
        }
        return triangle.toString();
    }
}
