import java.util.Random;

public class Dice {
    private Random random;
    private int diceValue = 0;

    Dice() {
        random = new Random();
        roll();
    }

    public int roll() {
        random = new Random(random.nextInt());
        diceValue = random.nextInt(6) + 1;
        return diceValue;
    }

    public int getDiceValue() {
        return diceValue;
    }
}
