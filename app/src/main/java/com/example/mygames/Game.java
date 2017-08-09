package com.example.mygames;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class Game {

    private int ranking;
    private String title;
    private String format;

    public Game(int ranking, String title, String format) {
        this.ranking = ranking;
        this.title = title;
        this.format = format;
    }

    public int getRanking() {
        return this.ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFormat() {
        return this.format;
    }

}
