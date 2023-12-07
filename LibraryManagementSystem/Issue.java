package LibraryManagementSystem;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Issue {
    HashMap<Integer, String> issue = new HashMap<>();

    Scanner input = new Scanner(System.in);
    Book b1 = new Book();
    Student s1 = new Student();
    public Issue(){
        s1.add();
        b1.add();
    }

    void issueBook(int id){
        System.out.println("Enter a book: ");
        String bookName = input.nextLine();

        if(b1.book.containsValue(bookName)) {
            int bookId = 0;

            for (Entry<Integer, String> entry : b1.book.entrySet()) {
                if (entry.getValue().equals(bookName)) {
                    bookId = entry.getKey();
                    break;
                }
            }

            b1.book.remove(bookId);
            issue.put(id, bookName);

            String name = s1.student.get(id);
            System.out.println("Name: " + name);
            System.out.println("Book: " + bookName);
            System.out.println("Book issued Congratulation");
        }
            else {
                System.out.println("Book doesn't exist");
                System.out.println("We have following Books:");
                System.out.println(b1.book);
            }

    }
}

