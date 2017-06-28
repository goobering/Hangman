package example.codeclan.com.hangman.enums;

/**
 * Created by user on 28/06/2017.
 */

public enum Stickman
{
    SIX(" O \n-|-\n/ \\"),
    FIVE(" O \n-|-\n/  "),
    FOUR(" O \n-|-\n   "),
    THREE(" O \n-| \n   "),
    TWO(" O \n | \n   "),
    ONE("   \n | \n   ");

    private String stickman;

    Stickman(String stickman)
    {
        this.stickman = stickman;
    }

    public String getStickman()
    {
        return stickman;
    }
}
