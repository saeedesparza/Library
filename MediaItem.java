public abstract class MediaItem extends Item {
    /**
     * creates double runtime for length of items
     */
    private double runtime;

    /**
     * MediaItem constructor initializes id, title, and runtime
     *
     * @param id used to initialize the id of item
     * @param title used to initialize the title of item
     * @param runtime used to initialize runtime of item
     */
    public MediaItem(int id, String title, double runtime) {
        super(id, title);
        this.runtime = runtime;
    }

    /**
     * getRuntime constructor used to return runtime field
     *
     * @return returns runtime
     */
    public double getRuntime() {
        return runtime;
    }

    /**
     * setRuntime constructor used to set new runtime field value
     * of a written item
     */
    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }
}
