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

        System.out.println("Please input a word:");
        System.out.print("> ");
        String input = sc.nextLine();
        Asker asker = new Asker();
        asker.setWord(input);
        Guesser guesser = new Guesser();
        Game game = new Game(asker, guesser);


    }


}
