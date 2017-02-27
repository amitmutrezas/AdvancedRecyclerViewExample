package com.example.amitmutreja.recyclerviewexample.controllers.implementors;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.amitmutreja.recyclerviewexample.R;
import com.example.amitmutreja.recyclerviewexample.controllers.contractors.IMovieController;
import com.example.amitmutreja.recyclerviewexample.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * @author amitmutreja on 25/02/17.
 * implements {@link IMovieController}
 */

public class MovieController implements IMovieController {
//    private static final int DATASET_COUNT = 60;

    private List<Movie> movieList;

    //region constructors
    public MovieController() {
        super();
    }

    public MovieController(List<Movie> movieList) {
        this.movieList = movieList;
    }
    //endregion

    //region Overridden methods
    @Override
    public List<Movie> getDataSet() {
        movieList = prepareMovieData();
        return movieList;
    }

    @Override
    public CharSequence getMovieTitleForToast(View view) {
        TextView titleView = (TextView) view.findViewById(R.id.title);
        CharSequence text = titleView.getText();
        return text;
    }

    //endregion

    //region private methods
    private List<Movie> prepareMovieData() {
        List<Movie> movieList = new ArrayList<>();

        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Movie("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Movie("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        return movieList;
    }
    //endregion
}
