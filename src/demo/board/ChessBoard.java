package demo.board;

import demo.pieces.*;

public class ChessBoard {
    private Piece[][] board = new Piece[8][8];
    private int row = 0;
    private int col = 0;

    public ChessBoard() {

        //Place Black Pieces on board
        board[0][0] = new BlackRook();
        board[0][1] = new BlackKnight();
        board[0][2] = new BlackBishop();
        board[0][3] = new BlackKing();
        board[0][4] = new BlackQueen();
        board[0][5] = new BlackBishop();
        board[0][6] = new BlackKnight();
        board[0][7] = new BlackRook();
        board[1][0] = new BlackPawn();
        board[1][1] = new BlackPawn();
        board[1][2] = new BlackPawn();
        board[1][3] = new BlackPawn();
        board[1][4] = new BlackPawn();
        board[1][5] = new BlackPawn();
        board[1][6] = new BlackPawn();
        board[1][7] = new BlackPawn();

        //Place White Pieces on board
        board[7][0] = new WhiteRook();
        board[7][1] = new WhiteKnight();
        board[7][2] = new WhiteBishop();
        board[7][3] = new WhiteQueen();
        board[7][4] = new WhiteKing();
        board[7][5] = new WhiteBishop();
        board[7][6] = new WhiteKnight();
        board[7][7] = new WhiteRook();
        board[6][0] = new WhitePawn();
        board[6][1] = new WhitePawn();
        board[6][2] = new WhitePawn();
        board[6][3] = new WhitePawn();
        board[6][4] = new WhitePawn();
        board[6][5] = new WhitePawn();
        board[6][6] = new WhitePawn();
        board[6][7] = new WhitePawn();


    }

    public void movePiece(String currentPosition, String desiredPosition){
        //Retrieve current and desired position via the positionParser
        int[] currentPos = positionParser(currentPosition);
        int[] desiredPos = positionParser(desiredPosition);

        //Copy whatever is in current position on the board to the desire position
        // and delete whats in the current position
        board[desiredPos[0]][desiredPos[1]] = board[currentPos[0]][currentPos[1]];
        board[currentPos[0]][currentPos[1]] = null;
    }

    public int[] positionParser(String position){

        //Instantiate array to return
        int[] positionsInIntArray = new int[2];

        //Translate positions from chess-terminology to positions in 2d Array
        positionsInIntArray[1] = parseFirstDigitOfPosition(position.toLowerCase().charAt(0));
        positionsInIntArray[0] = parseSecondDigitOfPosition(position.charAt(1));

        return positionsInIntArray;
    }

    public int parseFirstDigitOfPosition(char c){
        int result = 0;

        //Determine which character the first digit og currentPosition is, and translate it into the right position on board-array
        switch (c){
            case 'a':
                result = 0;
                break;
            case 'b':
                result = 1;
                break;
            case 'c':
                result = 2;
                break;
            case 'd':
                result = 3;
                break;
            case 'e':
                result = 4;
                break;
            case 'f':
                result = 5;
                break;
            case 'g':
                result = 6;
                break;
            case 'h':
                result = 7;
                break;
        }
        return result;

    }

    public int parseSecondDigitOfPosition(char i){
        int result = -1;
        int firstDigit = Character.getNumericValue(i);

            //Determine which character the first digit og currentPosition is, and translate it into the right position on board-array
            switch (firstDigit){
                case 1:
                    result = 7;
                    break;
                case 2:
                    result = 6;
                    break;
                case 3:
                    result = 5;
                    break;
                case 4:
                    result = 4;
                    break;
                case 5:
                    result = 3;
                    break;
                case 6:
                    result = 2;
                    break;
                case 7:
                    result = 1;
                    break;
                case 8:
                    result = 0;
                    break;


        }
        return result;
    }

    public void showBoard(){
        int sideCounter = 8;
        for (row = 0; row < board.length; row++)
        {
            System.out.println("");
            System.out.println("   -----------------------------------------");
            System.out.print(sideCounter + "  ");
            sideCounter--;

            for(col = 0; col < board[row].length; col++)
            {
                if ( board[row][col] != null ) {
                    System.out.print("| " + board[row][col] + " ");
                }
                else
                    System.out.print("|    ");

            }
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("   -----------------------------------------");
        System.out.println("     A    B    C    D    E    F    G    H  ");
    }
    
}
