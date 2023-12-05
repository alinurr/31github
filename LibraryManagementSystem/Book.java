package LibraryManagementSystem;

import java.util.HashMap;

public class Book {
    HashMap<Integer, String> book = new HashMap<>();

    void add(){
        book.put(11, "The Fault in our Stars");
        book.put(22, "A Good LibraryManagementSystem.Book");
    }

}
