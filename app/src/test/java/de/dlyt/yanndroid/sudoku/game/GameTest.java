package de.dlyt.yanndroid.sudoku.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testGameInitialization() {
        Game game = new Game(9, 30); // create a 9x9 sudoku with difficulty 30
        assertNotNull("Fields should not be null", game.getFields());
        assertEquals("Game size should be 9", 9, (int) game.getSize());
    }

    @Test
    public void testEmptyGameInitialization() {
        Game game = new Game(9); // empty editable game
        assertNotNull("Fields should not be null", game.getFields());
        assertEquals("Game size should be 9", 9, (int) game.getSize());
        assertTrue("Should be in edit mode", game.isEditMode());
    }
}
