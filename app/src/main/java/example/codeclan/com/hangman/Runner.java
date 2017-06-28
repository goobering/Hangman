package example.codeclan.com.hangman;

import java.util.Scanner;

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

        while (game.getGuesser().getLives() > 0 && game.getNumUncovered() < game.getAsker().getWord().length())
        {
            UI.showCoveredWord();
            UI.printLine(game.getCoveredWord());

            UI.showGetChar();
            Character userGuess = UI.getCharacter();
            //Get current number matched indices
            int currentUncoveredCount = game.getNumUncovered();
            //Get number of indices after guess
            game.getGuesser().addGuess(userGuess);

            //If number after > number before guesser loses a life
            if (game.getNumUncovered() == currentUncoveredCount)
            {
                game.getGuesser().loseLife();
                UI.showLoseLife();
                UI.showLives(guesser.getLives());
            }
        }

        if(game.getGuesser().getLives() > 0)
        {
            UI.showWon(game.getAsker().getWord());
            UI.showGuessed(game.getGuesser().getGuesses());
        }
        else
        {
            UI.showLost(game.getAsker().getWord());
            UI.showGuessed(game.getGuesser().getGuesses());
        }
    }


}
