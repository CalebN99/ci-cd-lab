
import dice.Dice;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Caleb Norris
 * @version 1.0
 * Dice Test class for jUnit5 tests
 */
public class DiceTest {

    /**
     * jUnit test, testing constructor
     */
    @Test
    public void testConstructor() {
        Dice die = new Dice(6, "Blue");
        assertAll(
                () -> assertEquals(6, die.getSides()),
                () -> assertEquals("Blue", die.getColor())
        );
    }

    /**
     * @param sides sides of die
     * jUnit test, testing if roll() method returns an int in proper range
     */
    @ParameterizedTest
    @ValueSource(ints = {6, 8, 12, 14, 16})
    public void testSingleRollRange(int sides) {
        Dice die = new Dice(sides, "Blue");
        checkRange(sides, die.roll());
    }

//    /**
//     * jUnit test, testing if all ints returned are in proper range
//     */
//    @RepeatedTest(5)
//    public void testManyRollsRange() {
//        final int totalRolls = 12;
//        Dice die = new Dice(totalRolls, "Blue");
//        int[] rolls = die.rollMany(10);
//
//        assertTrue(rolls[0] >= 1);
//        assertTrue(rolls[0] <= totalRolls);
//        for (int i = 1; i < 10; i++) {
//            checkRange(totalRolls, rolls[i]);
//        }
//    }

    private void checkRange(int high, int value) {
        assertTrue(value >= 1);
        assertTrue(value <= high);
    }
}