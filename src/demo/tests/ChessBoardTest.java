package demo.tests;

import demo.board.ChessBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    @Test
    void parseSecondDigitOfPositionEquals() {
        //arrange
        ChessBoard cb = new ChessBoard();
        char positionFirstDigit = '2';

        //act
        int result = cb.parseSecondDigitOfPosition(positionFirstDigit);

        //assert
        assertEquals(1, result);
    }

    @Test
    void parseSecondDigitOfPositionNotEquals() {
        //arrange
        ChessBoard cb = new ChessBoard();
        char positionFirstDigit = 3;

        //act
        int result = cb.parseSecondDigitOfPosition(positionFirstDigit);

        //assert
        assertNotEquals(3, result);
    }

    @Test
    void parseFirstDigitOfPositionEquals() {
        //arrange
        ChessBoard cb = new ChessBoard();
        char positionFirstDigit = 'd';

        //act
        int result = cb.parseFirstDigitOfPosition(positionFirstDigit);

        //assert
        assertEquals(3, result);
    }

    @Test
    void parseFirstDigitOfPositionNotEquals() {
        //arrange
        ChessBoard cb = new ChessBoard();
        char positionFirstDigit = 'g';

        //act
        int result = cb.parseFirstDigitOfPosition(positionFirstDigit);

        //assert
        assertNotEquals(3, result);
    }

    @Test
    void positionParserEqualsA2() {
        //arrange
        ChessBoard cb = new ChessBoard();
        String position = "a2";

        //act
        int[] result = cb.positionParser(position);

        //assert
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

    }

    @Test
    void positionParserEqualsA4() {
        //arrange
        ChessBoard cb = new ChessBoard();
        String position = "a4";

        //act
        int[] result = cb.positionParser(position);

        //assert
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);

    }




}