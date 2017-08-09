package com.example.mygames;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class Game {

    private int ranking;
    private String title;
    private String format;

    public Game(Integer ranking, String title, String format) {
        this.ranking = ranking;
        this.title = title;
        this.format = format;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFormat() {
        return this.format;
    }

}
