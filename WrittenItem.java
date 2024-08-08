public abstract class WrittenItem extends Item {
    /**
    * creates string author to add a name to items.
    */
    private String author;

    /**
     * WrittenItem constructor used to initialize the id, title, and author
     * of a written item
     *
     * @param id used to initialize id
     * @param title used to initialize title
     * @param author used to initialize author
     */
    public WrittenItem(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    /**
     * getAuthor method used to return author
     *
     * @return returns author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * setAuthor method used to set author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
