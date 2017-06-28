package example.codeclan.com.hangman;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by user on 28/06/2017.
 */

public class Game
{
    private Asker asker;
    private Guesser guesser;

    public Game(Asker asker, Guesser guesser)
    {
        this.asker = asker;
        this.guesser = guesser;
    }

    //Need a method to check for duplicate entries!


    //Gets the indices of all characters successfully guessed by the Guesser
    private ArrayList<Integer> getUncoveredIndices()
    {
        //Using a HashSet here to prevent duplicates
        HashSet<Integer> uncovered = new HashSet<Integer>();

        for (Character character : guesser.getGuesses())
        {
            for (Integer integer : asker.getIndices(character))
            {
                uncovered.add(integer);
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Integer integer : uncovered)
        {
            result.add(integer);
        }
        return result;
    }

    public int getNumUncovered()
    {
        return getUncoveredIndices().size();
    }

    public String getCoveredWord()
    {
        ArrayList<Integer> uncoveredIndices = getUncoveredIndices();
        StringBuilder sb = new StringBuilder(asker.getCoveredWord());
        String uncoveredWord = asker.getUncoveredWord(uncoveredIndices);

        return uncoveredWord;
    }

    public int getLives()
    {
        return guesser.getLives();
    }

    public int getAskerWordLength()
    {
        return asker.getWord().length();
    }

    public String getWord()
    {
        return asker.getWord();
    }

    public void addGuess(Character guess)
    {
        guesser.addGuess(guess);
    }

    public void loseLife()
    {
        guesser.loseLife();
    }

    public ArrayList<Character> getGuesses()
    {
        return guesser.getGuesses();
    }
}
