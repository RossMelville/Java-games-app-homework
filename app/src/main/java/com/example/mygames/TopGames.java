package com.example.mygames;

import java.util.ArrayList;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class TopGames {

    private ArrayList<Game> list;

    public TopGames() {
        list = new ArrayList<Game>();
        list.add(new Game(1, "The Legend of Zelda: A Link to the Past", "SNES"));
        list.add(new Game(2, "Super Mario 64", "N64"));
        list.add(new Game(3, "Super Mario World", "SNES"));
        list.add(new Game(4, "The Legend of Zelda: Ocarina of Time", "N64"));
        list.add(new Game(5, "GoldenEye", "N64"));
        list.add(new Game(6, "Grand Theft Auto III", "PS2"));
        list.add(new Game(7, "The Elder Scrolls V: Skyrim", "PS3"));
        list.add(new Game(8, "Metal Gear Solid", "PS1"));
        list.add(new Game(9, "Mario Kart 64", "N64"));
        list.add(new Game(10, "Star Fox", "SNES"));
        list.add(new Game(11, "Super Mario World 2: Yoshis Island", "SNES"));
        list.add(new Game(12, "Grand Theft Auto V", "PS3"));
        list.add(new Game(13, "Donkey Kong Country", "SNES"));
        list.add(new Game(14, "Super Metroid", "SNES"));
        list.add(new Game(15, "Super Mario Kart", "SNES"));



    }

}
