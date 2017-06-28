package example.codeclan.com.hangman.enums;

/**
 * Created by user on 28/06/2017.
 */

public enum ScriptLine
{
    PROMPT("> "),
    BLANKLINE(""),
    GETWORD("Please input a word:"),
    WORDIS("Game word is:"),
    GETCHAR("Please input a single character guess (only first character is used):"),
    LOSTLIFE("Guesser lost a life!"),
    LIVESLEFT("Lives left: "),
    WON("You won!"),
    LOST("You lost!"),
    YOUGUESSED("You guessed:"),
    WORDWAS("The word was:");

    private String scriptLine;

    ScriptLine(String scriptLine)
    {
        this.scriptLine = scriptLine;
    }

    public String getScriptLine()
    {
        return scriptLine;
    }
}