package com.example.mygames;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class TopGameTest {

    @Test
    public void testGetList() {
        TopGames topGames = new TopGames();
        assertEquals(15, topGames.getList().getSize());
    }
}
