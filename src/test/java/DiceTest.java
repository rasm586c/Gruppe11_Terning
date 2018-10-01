import org.junit.Before;
import org.junit.Test;

public class DiceTest {
    Dice dice;

    @Before
    public void setup(){
        dice = new Dice(); // Hvis man tænker nok over det, så er mandag i virkeligheden bare en meget lille version af fredag.
    }

    @Test
    public void roll() {
        int lastRoll = -1;
        int sameRollsInARow = 0;

        int[] rollsOf = new int[6];

        // Perform 60000 rolls
        for (int i = 0; i < 60000; i++) {
            int faceValue = dice.roll();

            if (lastRoll == faceValue) { sameRollsInARow++; }
            else { sameRollsInARow = 0; }

            assert faceValue <= 6 && faceValue > 0; // faceValue must be a value between 1 and 6
            assert sameRollsInARow < 50; // its highly unlikely that we roll the same value 50 times in a row ~0.000001% chance assume error.

            rollsOf[faceValue - 1]++;

            lastRoll = faceValue;
        }

        // On 60000 rolls there must be 10000 +- 400 of each face value
        for (int i = 0; i < rollsOf.length; i++) {
            assert rollsOf[i] < 10000 + 400;
            assert rollsOf[i] > 10000 - 400;
        }
    }
}
