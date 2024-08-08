public class CD extends MediaItem {
    /**
     * creates integer id for items
     */
    private String artist;
    /**
     * creates integer id for items
     */
    private String genre;

    /**
     * CD constructor initializes id, title, artist, genre, and runtime
     *
     * @param id used to initialize the id of item
     * @param title used to initialize the title of item
     * @param artist used to initialize artist of item
     * @param genre used to initialize genre of item
     * @param runtime used to initialize runtime of item
     */
    public CD(int id, String title, String artist, String genre, double runtime) {
        super(id, title, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    /**
     * getArtist method used to return artist
     *
     * @return returns artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * setArtist method used to set new artist value
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * getGenre method used to return genre
     *
     * @return returns genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * setGenre method used to set new genre value
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
