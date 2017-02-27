package com.example.amitmutreja.recyclerviewexample.views.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.amitmutreja.recyclerviewexample.R;
import com.example.amitmutreja.recyclerviewexample.views.fragments.FirstFrameFragment;
import com.example.amitmutreja.recyclerviewexample.views.fragments.MovieFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            FirstFrameFragment firstFrameFragment = new FirstFrameFragment();
            fragmentTransaction.add(R.id.fragment_container, firstFrameFragment).commit();
        }
    }

    public void startMovieFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        MovieFragment movieFragment = new MovieFragment();
        fragmentTransaction.replace(R.id.fragment_container, movieFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
