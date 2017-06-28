package example.codeclan.com.hangman;

import java.util.ArrayList;

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

    public Asker getAsker()
    {
        return asker;
    }

    public Guesser getGuesser()
    {
        return guesser;
    }

    private ArrayList<Integer> getUncoveredIndices()
    {
        ArrayList<Integer> uncovered = new ArrayList<Integer>();
        for (Character character : guesser.getGuesses())
        {
            for (Integer integer : asker.getIndices(character))
            {
                uncovered.add(integer);
            }
        }

        return uncovered;
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

}
