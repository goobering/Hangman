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

    public String coveredWord(){
        ArrayList<Integer> uncovered = new ArrayList<Integer>();
        for (Character character : guesser.getGuesses()){
           for (Integer integer : asker.getIndices(character)){
            uncovered.add(integer);
           }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < asker.getWord().length(); i ++){
            sb.append('*');}
        for (Integer guessInt : uncovered){
            sb.setCharAt(guessInt, asker.getWord().charAt(guessInt));
        }
        return sb.toString();
    }


}
