package uvt.models;

public class DocumentManager {
    private static DocumentManager instance;
    private static Book book;

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }
    public static Book getBook() {
        if (book == null) {
            book = new Book("Carte nou creata");
        }
        return book;
    }
}