/*
 * TCSS 143 B - Fundamentals Of Object-Oriented Programming Theory And Application - Fall 2023
 * Instructor: Dr. Dongfang Zhao
 * Programming Project 2
 */
/**
 * @author Saeed Esparza
 * @version 0.1
 *          The ItemMain class contains the main method that creates an array of
 *          Item objects,
 *          checks out, returns and modifies all the items in the library, and
 *          prints their current status.
 *          The class also contains methods to check out, return, modify and
 *          print all items in the library.
 *          The Item array contains three different types of items: Book, CD and
 *          JournalArticle.
 *          The main method demonstrates the polymorphic behavior of the Item
 *          class and its subclasses.
 */
public class ItemMain {
    /**
     * Checks out all items in the given array by calling the checkOut() method on
     * each item.
     * 
     * @param items the array of items to check out
     */
    public static void checkOutAllItems(Item[] items) {
        for (Item item : items) {
            item.checkOut();
        }
    }

    /**
     * Returns all items in the given array by calling the returnItem() method on
     * each item.
     * 
     * @param items the array of items to be returned
     */
    public static void returnAllItems(Item[] items) {
        for (Item item : items) {
            item.returnItem();
        }
    }

    /**
     * Modifies an array of Item objects by setting new IDs, titles, and other
     * fields for WrittenItem and MediaItem objects.
     * 
     * @param items the array of Item objects to be modified
     */
    public static void modifyAllItems(Item[] items) {
        int[] newIds = { 4, 5, 6 };
        String[] newTitles = { "Java for Dummies", "The Dark Side of Social Media", "The benefits of Almonds" };
        String[] newAuthors = { "John Doe", "John Doe", "John Doe" };
        String[] newArtists = { "The Beatles", "Pink Floyd", "The Beatles" };
        String[] newGenres = { "Rock", "Jazz", "Pop" };
        for (int i = 0; i < items.length; i++) {
            items[i].setId(newIds[i]);
            items[i].setTitle(newTitles[i]);
            if (items[i] instanceof WrittenItem) {
                ((WrittenItem) items[i]).setAuthor(newAuthors[i]);
            }
            if (items[i] instanceof MediaItem) {
                ((MediaItem) items[i]).setRuntime(60.0);
                ((CD) items[i]).setArtist(newArtists[i]);
                ((CD) items[i]).setGenre(newGenres[i]);
            }
        }
    }

    /**
     * Prints the details of each item in the given array.
     * For each item, prints its ID, title, Availability status, and additional
     * details
     * depending on whether it is a WrittenItem or MediaItem.
     * If the item is a WrittenItem, also prints its author.
     * If the item is a MediaItem, also prints its artist, genre, and runtime.
     *
     * @param items the array of items to print
     */
    public static void printItems(Item[] items) {
        for (Item item : items) {
            System.out.println("********************************");
            System.out.println("The ID is: " + item.getId());
            System.out.println("The title is: " + item.getTitle());
            System.out.println("Is the item in stock? " + item.isInStock());
            if (item instanceof WrittenItem) {
                System.out.println("The author is: " + ((WrittenItem) item).getAuthor());
            }
            if (item instanceof MediaItem) {
                System.out.println("The artist is: " + ((CD) item).getArtist());
                System.out.println("The genre is: " + ((CD) item).getGenre());
                System.out.println("The playing time is: " + ((MediaItem) item).getRuntime());
            }
        }
    }

    /**
     * The main method creates an array of Item objects,
     * checks out, returns and modifies all the items in the library, and prints
     * their current status.
     * The main method calls the following methods:
     * - printItems: prints the details of all the items in the library
     * - checkOutAllItems: checks out all the items in the library
     * - returnAllItems: returns all the items in the library
     * - modifyAllItems: modifies all the items in the library
     * 
     * The Item array contains three different types of items: Book, CD and
     * JournalArticle.
     * The main method demonstrates the polymorphic behavior of the Item class and
     * its subclasses.
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * An array of Item objects.
         */
        Item[] items = new Item[3];
        items[0] = new Book(1, "Building Java Programs", "Reges and Stepp");
        items[1] = new CD(2, "The Wall", "Pink Floyd", "Rock", 81.23);
        items[2] = new JournalArticle(3, "The benefits of a good night's sleep", "Smith and Jones");
        System.out.println("********************************");
        System.out.println("Welcome to the library: ");
        System.out.println("Initial items in the library: ");
        printItems(items);
        System.out.println("********************************");
        System.out.println("We will check out all the items in the library: ");
        checkOutAllItems(items);
        System.out.println("********************************");
        System.out.println("Current Status of the items in the library: ");
        printItems(items);
        System.out.println("We will return all the items in the library: ");
        returnAllItems(items);
        System.out.println("********************************");
        System.out.println("Current Status of the items in the library: ");
        printItems(items);
        System.out.println("We will modify all the items in the library: ");
        modifyAllItems(items);
        System.out.println("********************************");
        System.out.println("We will print all the items in the library: ");
        printItems(items);
    }
}
