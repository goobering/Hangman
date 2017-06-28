package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Runner
{
    public static void main(String[] args)
    {
        UI.showGetWord();
        String input = UI.getWord();
        Asker asker = new Asker();
        asker.setWord(input.toLowerCase());
        Guesser guesser = new Guesser();
        Game game = new Game(asker, guesser);

        while (game.getLives() > 0 && !(game.getCoveredWord().equals(game.getWord())))
        {
            UI.showCoveredWord();
            UI.printLine(game.getCoveredWord());

            UI.showGetChar();
            Character userGuess = UI.getCharacter(game.getGuesses());
            //Get current number matched indices
            int currentUncoveredCount = game.getNumUncovered();
            //Get number of indices after guess
            game.addGuess(userGuess);

            //If number after > number before guesser loses a life
            if (game.getNumUncovered() == currentUncoveredCount)
            {
                game.loseLife();
                UI.showLoseLife();
                UI.showLives(game.getLives());
            }
        }

        if(game.getLives() > 0)
        {
            UI.showWon(game.getWord());
            UI.showGuessed(game.getGuesses());
        }
        else
        {
            UI.showLost(game.getWord());
            UI.showGuessed(game.getGuesses());
        }
    }


}
