package demo.ui;

import demo.board.ChessBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserPrompterTest {

    @Test
    void isValidPositionEquals() {
        //Arrange
        UserPrompter up = new UserPrompter();

        //Act
        //Assert
        assertTrue(up.isValidPosition("a1"));
        assertTrue(up.isValidPosition("h8"));
    }

    @Test
    void isValidPositionNotEqualsFirstDigit() {
        //Arrange
        UserPrompter up = new UserPrompter();

        //Act
        //Assert
        assertFalse(up.isValidPosition("k1"));
        assertFalse(up.isValidPosition("18"));
    }

    @Test
    void isValidPositionNotEqualsSecondDigit() {
        //Arrange
        UserPrompter up = new UserPrompter();

        //Act
        //Assert
        assertFalse(up.isValidPosition("a0"));
        assertFalse(up.isValidPosition("h9"));
    }

    @Test
    void isValidPositionNotEqualsTooShortInput() {
        //Arrange
        UserPrompter up = new UserPrompter();

        //Act
        //Assert
        assertFalse(up.isValidPosition("a"));
    }

    @Test
    void isValidPositionNotEqualsTooLongInput() {
        //Arrange
        UserPrompter up = new UserPrompter();

        //Act
        //Assert
        assertFalse(up.isValidPosition("a1d"));
    }
}