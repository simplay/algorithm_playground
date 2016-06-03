public class Main {
    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {
            int randomInt = (int)(Math.random() * 100);
            new BinSearchExample(randomInt);
        }
    }
}
