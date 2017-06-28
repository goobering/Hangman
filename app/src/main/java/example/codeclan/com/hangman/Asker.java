package example.codeclan.com.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */

public class Asker
{
    private String word;

    public Asker()
    {

    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getWord()
    {
        return word;
    }

    public ArrayList<Integer> getIndices(char guess)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == guess)
            {
                result.add(i);
            }
        }

        return result;
    }
}
