package com.example.amitmutreja.recyclerviewexample.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amitmutreja.recyclerviewexample.R;
import com.example.amitmutreja.recyclerviewexample.models.Movie;

import java.util.List;

/**
 * Created by
 * @author amitmutreja on 24/02/17.
 * A {@link android.support.v7.widget.RecyclerView.Adapter} subclass for learn fragments recycler views
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private static final String TAG = "MovieAdapter";

    private List<Movie> mDataSet;


    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, year, genre;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            genre = (TextView) itemView.findViewById(R.id.genre);
            year = (TextView) itemView.findViewById(R.id.year);
        }

        public TextView getTitle() {
            return title;
        }

        public TextView getYear() {
            return year;
        }

        public TextView getGenre() {
            return genre;
        }
    }


    /**
     * Initialize the dataset of the Adapter.
     *
     * @param mDataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public MovieAdapter(List<Movie> mDataSet) {
        this.mDataSet = mDataSet;
    }

    public void loadData() {
        notifyDataSetChanged();
    }


    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new ViewHolder(view);
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        Movie movie = mDataSet.get(position);
        viewHolder.getTitle().setText(movie.getmTitle());
        viewHolder.getGenre().setText(movie.getmGenre());
        viewHolder.getYear().setText(movie.getmYear());
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
