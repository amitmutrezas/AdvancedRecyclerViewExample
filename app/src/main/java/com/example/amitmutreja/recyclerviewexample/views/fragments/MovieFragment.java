package com.example.amitmutreja.recyclerviewexample.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amitmutreja.recyclerviewexample.R;
import com.example.amitmutreja.recyclerviewexample.adapters.MovieAdapter;
import com.example.amitmutreja.recyclerviewexample.controllers.implementors.MovieController;
import com.example.amitmutreja.recyclerviewexample.controllers.contractors.IMovieController;
import com.example.amitmutreja.recyclerviewexample.models.Movie;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class MovieFragment extends Fragment {

    //region member variables
    private IMovieController mMovieController;
    private RecyclerView mRecyclerView;
    private MovieAdapter mMovieAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.ItemDecoration mItemDecoration;
    private List<Movie> mDataset;
    //endregion

    public MovieFragment() {
        super();
    }

    /**
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ask learnController to initialize the dataSet for you
        mMovieController = new MovieController();
        mDataset = mMovieController.getDataSet();
    }

    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return rootView
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_movie, container, false);


        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.learn_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mMovieAdapter = new MovieAdapter(mDataset);
        // Set MovieAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mMovieAdapter);

        mItemDecoration = new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(mItemDecoration);

        mMovieAdapter.loadData();

//        mMovieAdapter.addData("new_string_will_come_here_after_it_gets_notified");

        return rootView;
    }

}
