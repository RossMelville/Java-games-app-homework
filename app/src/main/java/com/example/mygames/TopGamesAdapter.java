package com.example.mygames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rossmelville on 09/08/2017.
 */

public class TopGamesAdapter extends ArrayAdapter<Game> {

    public TopGamesAdapter(Context context, ArrayList<Game> games) {
        super (context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.top_games_list, parent, false);
        }

        Game currentGame = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGame.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentGame.getTitle());

        TextView format = (TextView) listItemView.findViewById(R.id.format);
        format.setText(currentGame.getFormat());

        listItemView.setTag(currentGame);

        return listItemView;
    }

}
