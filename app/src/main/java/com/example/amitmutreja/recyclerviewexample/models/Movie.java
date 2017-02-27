package com.example.amitmutreja.recyclerviewexample.models;

/**
 * Created by amitmutreja on 26/02/17.
 */

public class Movie {
    private String mTitle, mGenre, mYear;

    public Movie() {
    }

    public Movie(String mTitle, String mGenre, String mYear) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mYear = mYear;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }
}
