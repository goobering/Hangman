package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class TestAsker
{
    Asker asker;

    @Before
    public void before()
    {
        asker = new Asker();
    }

    @Test
    public void getWord()
    {
        asker.setWord("Test");
        assertEquals("Test", asker.getWord());
    }

    @Test
    public void testGetIndices()
    {
        asker.setWord("Test");

        ArrayList<Character> guesses = new ArrayList<Character>();
        guesses.add('a');
        guesses.add('e');
        guesses.add('d');
        guesses.add('r');
        guesses.add('s');

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);

        assertEquals(expected, asker.getIndices(guesses));
    }
}
