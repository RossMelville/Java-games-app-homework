package com.example.mygames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_game);

        TopGames topGames = new TopGames();
        ArrayList<Game> list = topGames.getList();

        TopGamesAdapter gameAdapter = new TopGamesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(gameAdapter);
    }

    public void getGame(View listItem) {
        Game game = (Game) listItem.getTag();
    }
}
