public abstract class Item {
    /**
     * creates integer id for items
     */
    private int id;
    /**
     * creates string title for items
     */
    private String title;
    /**
     * creates boolean isInStock to verify stock of item
     */
    private boolean isInStock;
    
    /**
     * Item constructor initializes id and title and initializes
     * the isInStock with Boolean value true(default)
     *
     * @param id used to initialize the id of item
     * @param title used to initialize the title of item
     */
    public Item(int id, String title) {
        this.id = id;
        this.title = title;
        this.isInStock = true;
    }

    /**
     * checkOut method used to set isInStock to Boolean value false
     */
    public void checkOut() {
        isInStock = false;
    }

    /**
     * returnItem method used to set isInStock Boolean value to true when item
     * is returned
     */
    public void returnItem() {
        isInStock = true;
    }

    /**
     * returnItem method used to return id of item
     *
     * @return returns the id of item
     */
    public int getId() {
        return id;
    }

    /**
     * getTitle method used to return title of item
     *
     * @return returns the title of item
     */
    public String getTitle() {
        return title;
    }

    /**
     * isInStock method used to return boolean stock value
     *
     * @return returns the stock of item
     */
    public boolean isInStock() {
        return isInStock;
    }

    /**
     * setId modifier used to set id of item
     *
     * @param id used to set id of item
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * returnItem method used to set title of item
     *
     * @param title used to set title of item
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
