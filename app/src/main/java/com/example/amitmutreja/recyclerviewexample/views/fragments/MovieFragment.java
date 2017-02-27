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
import com.example.amitmutreja.recyclerviewexample.adapters.CustomLearnAdapter;
import com.example.amitmutreja.recyclerviewexample.controllers.implementors.LearnController;
import com.example.amitmutreja.recyclerviewexample.controllers.interfaces.ILearnController;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class MovieFragment extends Fragment {

    //region member variables
    private ILearnController mLearnController;
    private RecyclerView mRecyclerView;
    private CustomLearnAdapter mMovieAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.ItemDecoration mItemDecoration;
    private String[] mDataset;
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
        mLearnController = new LearnController();
        mDataset = mLearnController.getDataSet();
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
        View rootView = inflater.inflate(R.layout.fragment_learn, container, false);

        // BEGIN_INCLUDE(initializeRecyclerView)
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.learn_recycler_view);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mMovieAdapter = new CustomLearnAdapter(mDataset);
        // Set CustomLearnAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mMovieAdapter);

        mItemDecoration = new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(mItemDecoration);

        mMovieAdapter.loadData();

        mMovieAdapter.addData("new_string_will_come_here_after_it_gets_notified");
        // END_INCLUDE(initializeRecyclerView)

        return rootView;
    }
}
