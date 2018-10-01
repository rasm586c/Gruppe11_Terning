import java.util.Random;

public class Dice {
    Random random;
    Dice() {
        random = new Random();
    }

    // roll the die and return the value (1-6)
    public int roll() {
        random = new Random(random.nextInt());
        return random.nextInt(6) + 1;
    }

    // roll the die n times and print the values
    public void rollMultiple(int n) {
        for (int i=1; i<n; i++) {
            System.out.print(roll() + " ");
        }
    }
}
