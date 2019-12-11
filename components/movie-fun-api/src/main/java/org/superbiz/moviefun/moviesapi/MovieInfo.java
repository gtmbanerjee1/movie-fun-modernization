package org.superbiz.moviefun.moviesapi;

public class MovieInfo {

    private long id;

    private String director;
    private String title;
    private int year;
    private String genre;
    private int rating;

    public MovieInfo()
    {}

    public MovieInfo(String title, String director, String genre, int rating, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieInfo)) return false;

        MovieInfo movieInfo = (MovieInfo) o;

        if (getId() != movieInfo.getId()) return false;
        if (getYear() != movieInfo.getYear()) return false;
        if (getRating() != movieInfo.getRating()) return false;
        if (getDirector() != null ? !getDirector().equals(movieInfo.getDirector()) : movieInfo.getDirector() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(movieInfo.getTitle()) : movieInfo.getTitle() != null) return false;
        return getGenre() != null ? getGenre().equals(movieInfo.getGenre()) : movieInfo.getGenre() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getDirector() != null ? getDirector().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + getYear();
        result = 31 * result + (getGenre() != null ? getGenre().hashCode() : 0);
        result = 31 * result + getRating();
        return result;
    }




}
