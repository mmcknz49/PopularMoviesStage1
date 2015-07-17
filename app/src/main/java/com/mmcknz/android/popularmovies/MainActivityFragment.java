package com.mmcknz.android.popularmovies;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        String[] movieArray = {
                "Jurassic World",
                "Terminator Genisys",
                "Minions",
                "Mad Max: Fury Road",
                "Ted 2",
                "Insurgent",
                "San Andreas",
                "Chappie",
                "Jupiter Ascending",
                "Interstellar",
                "Kingsman: The Secret Service",
                "Ant-Man",
                "The Hunger Games: Mockingjay - Part 1",
                "The Hobbit: The Battle of the Five Armies",
                "Maggie",
                "John Wick",
                "The Imitation Game",
                "Avengers: Age of Ultron",
                "Cinderella"
        };

        List<String> popularMovies = new ArrayList<String>(
                Arrays.asList(movieArray)
        );

        ArrayAdapter mMovieAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_movie,
                R.id.list_item_movie_textview,
                popularMovies
        );

        ListView listView = (ListView) rootView.findViewById(
                R.id.listview_movie);

        listView.setAdapter(mMovieAdapter);


        return rootView;
    }
}
