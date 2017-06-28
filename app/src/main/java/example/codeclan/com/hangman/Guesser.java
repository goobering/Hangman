package example.codeclan.com.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */

public class Guesser
{
    private int lives;
    private ArrayList<Character> guesses;

    public Guesser()
    {
        lives = 6;
        guesses = new ArrayList<Character>();
    }

    public int getLives()
    {
        return lives;
    }

    public void loseLife()
    {
        lives -= 1;
    }

    public ArrayList<Character> getGuesses()
    {
        return guesses;
    }

    public void addGuess(char guess)
    {
        guesses.add(guess);
    }
}
