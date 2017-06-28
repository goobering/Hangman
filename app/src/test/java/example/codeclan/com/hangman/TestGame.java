package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestGame
{
    private Game game;
    private Asker asker;
    private Guesser guesser;

    @Before
    public void before()
    {
        this.asker = new Asker();
        this.guesser = new Guesser();
        this.game = new Game(asker, guesser);
    }

    @Test
    public void testGetUncoveredWord()
    {
        game.getAsker().setWord("Test");
        assertEquals("****", game.getCoveredWord());
    }

    @Test
    public void testHalfUncoveredWord()
    {
        game.getAsker().setWord("Test");

        game.getGuesser().addGuess('e');
        game.getGuesser().addGuess('s');

        assertEquals("*es*", game.getCoveredWord());
    }
}
