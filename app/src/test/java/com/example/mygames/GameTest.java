package com.example.mygames;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game(1, "Super Mario World", "SNES");
    }

    @Test
    public void canReturnRanking() {
        assertEquals(1, game.getRanking());
    }

    @Test
    public void canReturnTitle() {
        assertEquals("Super Mario World", game.getTitle());
    }

    @Test
    public void canReturnFormat() {
        assertEquals("SNES", game.getFormat());
    }
}
