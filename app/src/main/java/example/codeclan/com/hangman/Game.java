package example.codeclan.com.hangman;

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
}
