package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestGuesser
{
    Guesser guesser;

    @Before
    public void before()
    {
        guesser = new Guesser();
    }

    @Test
    public void canGetLives(){
        assertEquals(6, guesser.getLives());
    }

    @Test
    public void canLoseLives(){
        guesser.loseLife();
        assertEquals(5, guesser.getLives());
    }

    @Test
    public void canGetNumGuesses(){
        guesser.addGuess('r');
        assertEquals(1, guesser.getNumGuesses());
    }

    @Test
    public void canAddGuesses(){
        guesser.addGuess('p');
        assertEquals(1, guesser.getNumGuesses());
        assertEquals(new Character('p'), guesser.getGuesses().get(guesser.getGuesses().size()-1));
    }





}
