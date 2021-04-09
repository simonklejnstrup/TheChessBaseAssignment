package demo.ui;

public class UI {
    private UserPrompter up = new UserPrompter();
    private String nextMove = "";

    public String getNextMove(){
        String userInput = up.getNextMove();
        return userInput;
    }


}
