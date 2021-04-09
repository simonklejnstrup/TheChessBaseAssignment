package demo.ui;

import java.util.Scanner;

public class UserPrompter {

    private Scanner scanner = new Scanner(System.in);

    public String getNextMove(){
        String position = scan();

        //Check if starting position user input, is a valid position
        while (!isValidPosition(position)){
            System.out.println("Not a valid postion");
            System.out.print("Try again: ");
            position = getNextMove();
        }
        return position;
    }

    public String scan(){
        return  scanner.next();
    }

    public boolean isValidPosition(String input){
        boolean validation = false;
        String firstDigitLowerCase = "";
        char firstDigitAsChar = 0;
        int secondDigit = 0;

        //check if input is excactly 2 characters long and make sure it is nok blank
        if (input.length() == 2 && !input.isBlank()) {

            //Manipulate first digit of userinput by converting it from char to String and to lower case
            firstDigitLowerCase = Character.toString(input.charAt(0)).toLowerCase();

            //Convert is back to char so we can check the chars numerical value according to the ASCII table
            firstDigitAsChar = firstDigitLowerCase.charAt(0);

            //Cast second digit of userinput to int
            secondDigit = Character.getNumericValue(input.charAt(1));
        }

        //Check if firstDigit is a-h and if secondDigit is 1-8
        if (firstDigitAsChar >= 97 && firstDigitAsChar <= 104
                && secondDigit >= 1 && secondDigit <=8) {
            validation = true;
        }
        return validation;
    }

}
