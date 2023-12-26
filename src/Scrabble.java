public class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int sum = 0;
        String wordTransformed = word.toUpperCase();
        for (int i = 0; i < word.length(); i++) {
            switch (wordTransformed.charAt(i)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> sum += 1;
                case 'D', 'G' -> sum += 2;
                case 'B', 'C', 'M', 'P' -> sum += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> sum += 4;
                case 'K' -> sum += 5;
                case 'J', 'X' -> sum += 8;
                case 'Q', 'Z' -> sum += 10;

            }
        }
        return sum;
    }
}
