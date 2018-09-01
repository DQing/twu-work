class DiamondExercises {
    static String getDiamond(int lines, String name) {
        String diamondTop = getDiamondTop(lines);
        String diamondBottom = getDiamondBottom(lines);
        return diamondTop + "\n" + name + "\n" + diamondBottom;
    }

    private static String getDiamondTop(int lines) {
        StringBuilder diamondTop = new StringBuilder();
        for (int i = 1; i <= lines - 1; i++) {
            for (int k = 0; k < lines - i; k++) {
                diamondTop.append(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                diamondTop.append("*");
            }
            if (i != lines - 1) {
                diamondTop.append("\n");
            }
        }
        return diamondTop.toString();
    }

    private static String getDiamondBottom(int lines) {
        StringBuilder diamondBottom = new StringBuilder();
        for (int i = lines - 1; i > 0; i--) {
            for (int k = lines; k > i; k--) {
                diamondBottom.append(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                diamondBottom.append("*");
            }
            if (i != 1) {
                diamondBottom.append("\n");
            }
        }
        return diamondBottom.toString();
    }
}
