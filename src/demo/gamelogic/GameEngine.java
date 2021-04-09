package demo.gamelogic;

import demo.board.ChessBoard;
import demo.ui.UI;

public class GameEngine {

    UI ui = new UI();

    public void startGame(){
        //Instatiate and fill up board
        ChessBoard board = new ChessBoard();

        //Show full board
        board.showBoard();
        System.out.println("");


        while(true) {

            //Prompt user to make a move
            System.out.print("Input position to move from: ");
            String positionFrom = ui.getNextMove();
            System.out.println("");

            System.out.print("Input position to move to: ");
            String positionTo = ui.getNextMove();
            System.out.println("");

            //Move Piece
            board.movePiece(positionFrom, positionTo);

            //Show outcome of users move
            board.showBoard();
            System.out.println("");

        }





    }
}
