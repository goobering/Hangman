package example.codeclan.com.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class Runner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Viewer.printLine("Please input a word:");
        Viewer.print("> ");
        String input = sc.nextLine();
        Asker asker = new Asker();
        asker.setWord(input);
        Guesser guesser = new Guesser();
        Game game = new Game(asker, guesser);

        while (game.getGuesser().getLives() > 0 && game.getNumUncovered() < game.getAsker().getWord().length())
        {
            Viewer.printLine("Game word is:");
            Viewer.printLine(game.getCoveredWord());
            Viewer.printLine("");
            Viewer.printLine("Please input a single character guess:");
            Viewer.print("> ");
            String userInput = sc.nextLine();
            Character userGuess = userInput.charAt(0);
            //Get current number matched indices
            int currentUncoveredCount = game.getNumUncovered();
            //Get number of indices after guess
            game.getGuesser().addGuess(userGuess);

            //If number after > number before guesser loses a life
            if (game.getNumUncovered() == currentUncoveredCount)
            {
                game.getGuesser().loseLife();
                Viewer.printLine("Guesser lost a life!");
                Viewer.printLine(String.format("Guesser has %d lives.", guesser.getLives()));
                Viewer.printLine("");
            }
        }

        if(game.getGuesser().getLives() > 0)
        {
            Viewer.printLine("You won!");
            Viewer.printLine(String.format("The word was: %s", game.getAsker().getWord()));
            Viewer.printLine("You guessed:");
            for(Character character : game.getGuesser().getGuesses())
            {
                Viewer.printLine(character.toString());
            }
            Viewer.printLine("");
        }
        else
        {
            Viewer.printLine("You lost!");
            Viewer.printLine(String.format("The word was: %s", game.getAsker().getWord()));
            Viewer.printLine("You guessed:");
            for(Character character : game.getGuesser().getGuesses())
            {
                Viewer.printLine(character.toString());
            }
            Viewer.printLine("");
        }
    }


}
