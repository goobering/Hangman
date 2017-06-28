package example.codeclan.com.hangman.enums;

/**
 * Created by user on 28/06/2017.
 */

public enum ScriptLine
{
    PROMPT("> "),
    BLANKLINE(""),
    GETWORD("Please input a word - lower case alphabet only:"),
    GETCHAR("Please input a character - lower case alphabet only:"),
    WORDIS("Game word is:"),
    LOSTLIFE("Guesser lost a life!"),
    WON("You won!"),
    LOST("You lost!"),
    YOUGUESSED("You guessed:"),
    WORDWAS("The word was:"),
    NOWORDERROR("Please input a single word - no numbers, punctuation or spaces please!"),
    NOCHARERROR("Please input a single character - no numbers, punctuation or spaces please!");

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