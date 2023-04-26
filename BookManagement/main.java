package BookManagement;
import java.util.ArrayList;
import java.util.Scanner;

import BookManagement.Lib.*;

public class main {
    public static void main(String[] args) {
        Library lib = new Library("H1", 100);
        Worker wrk1 = new Worker(lib);
        while(true){
            System.out.println("=======MAIN MENU=======)");
            System.out.println("1. Show library information");
            System.out.println("2. Add new book");
            System.out.println("3. Find book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter your select :");
    
            int select = myobj.nextInt();
            switch (select) {
                case 1:
                    System.out.println(lib.toString());
                    break;
                case 2:
                    Book book = createNewBook();
                    wrk1.addBook(book);
                    break;
                case 3:
                    System.out.println("Enter the id of the book :");
                    int id = myobj.nextInt();
                    Book book1 = new Book(id);
                    wrk1.search(book1);
                    break;
                case 4:
                    Book book2 = createNewBook();
                    wrk1.borrowBook(book2);
                    break;
                case 5:
                    Book book3 = createNewBook();
                    wrk1.returnBook(book3);
                    break;
                case 6:
                    System.out.println("See you again !!!");
                    break;
                default:
                    break;
            }
            if (select == 6) break;
        }
    }
    public static Book createNewBook(){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the id of the book :");
        int id = myobj.nextInt();
        System.out.println("Enter the name of the book :");
        String dummy = myobj.nextLine();
        String name = myobj.nextLine();
        System.out.println("Enter the author of the book :");
        String author = myobj.nextLine();
        System.out.println("Enter the type of the book :");
        int type = myobj.nextInt();
        return new Book(id, name, author, type);
    }
}