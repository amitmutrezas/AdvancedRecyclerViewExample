package com.example.amitmutreja.recyclerviewexample.controllers.contractors;

import android.view.View;

import com.example.amitmutreja.recyclerviewexample.models.Movie;

import java.util.List;

/**
 * Created by amitmutreja on 25/02/17.
 */

public interface IMovieController {
    public List<Movie> getDataSet();

    public CharSequence getMovieTitleForToast(View view);
}
