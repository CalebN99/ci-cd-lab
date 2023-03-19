package dice;

import java.util.Random;

/**
 * @author Josh Archer
 * @version 1.0
 * Dice Class
 */
public class Dice
{
    private Random random;
    private int sides;
    private String color;

    /**
     * @param sides int
     * @param color string
     * constructor for dice class
     */
    public Dice(int sides, String color) {
        this.sides = sides;
        this.color = color;
        random = new Random();
    }

    /**
     * @return sides of dice
     */
    public int getSides() {
        return sides;
    }

    /**
     * @return color of dice
     */
    public String getColor() {
        return color;
    }

    /**
     * @return random int between 1 and sides of dice
     */
    public int roll()
    {
        return random.nextInt(sides) + 1;
    }

    /**
     * @param times times of rolls
     * @return int array of rolls of dice
     */
    public int[] rollMany(int times)
    {
        int[] rollsHistory = new int[times];
        for (int i = 0; i < times; i++)
        {
            rollsHistory[i] = roll();
        }
        return rollsHistory;
    }

    @Override
    public String toString()
    {
        return "A " + sides + " sided die";
    }
}