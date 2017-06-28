package example.codeclan.com.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class Runner
{
    public static void main(String[] args)
    {
        //Should move into UI.java
        Scanner sc = new Scanner(System.in);

        UI.showGetWord();

        //Should move into UI.java
        String input = sc.nextLine();
        Asker asker = new Asker();
        asker.setWord(input.toLowerCase());
        Guesser guesser = new Guesser();
        Game game = new Game(asker, guesser);

        while (game.getGuesser().getLives() > 0 && game.getNumUncovered() < game.getAsker().getWord().length())
        {
            UI.showCoveredWord();
            UI.printLine(game.getCoveredWord());
            UI.showInputGuess();

            String userInput = sc.nextLine().toLowerCase();
            Character userGuess = userInput.charAt(0);
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
