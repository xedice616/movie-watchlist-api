package com.xadice.moviewatchlist.moviewatchlist.model;

public class Movie {

    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private boolean watched;

    public Movie() {
    }

    public Movie (Long id, String title , String genre, int releaseYear, boolean watched ){
        this.id= id;
        this.title = title;
        this.genre =  genre ;
        this.releaseYear = releaseYear;
        this.watched = watched;
    }

    public Long getId(){
        return id ;
    }

    public void setId (Long id ){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
