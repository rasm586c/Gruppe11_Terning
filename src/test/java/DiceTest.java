import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    Dice dice;

    @Before
    public void setup(){
        dice = new Dice();
    }

    @Test
    public void roll() {
        int lastRoll = -1;
        int sameRollsInARow = 0;

        for (int i = 0; i < 10000; i++) {
            int faceValue = dice.roll();

            if (lastRoll == faceValue) { sameRollsInARow++; }
            else { sameRollsInARow = 0; }

            assert faceValue <= 6 && faceValue > 0; // faceValue must be a value between 1 and 6
            assert sameRollsInARow < 50; // its highly unlikely that we roll the same value 50 times in a row ~0.000001% chance assume error.

            lastRoll = faceValue;
        }
    }

    @Test
    public void getFaceValue() {

    }
}