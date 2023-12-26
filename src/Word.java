public class Word {
    public static void main(String[] args) {
        Scrabble word = new Scrabble("cabbage");
        int score = word.getScore();
        System.out.printf("Point for that word: %d%n", score);
    }
}
