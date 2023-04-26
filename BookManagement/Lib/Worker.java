package BookManagement.Lib;
import java.util.*;;

public class Worker {
    Library lib;
    ArrayList<Book> borrowedBooks;
    public Worker(Library lib){
        this.lib = lib;
    }
    public void addBook(Book book){
        lib.getNameBooks().add(book);
        lib.setNumberOfBooks(lib.getNameBooks().size());
    }
    public void search (Book book){
        for (int i = 0; i < lib.getNameBooks().size(); i++){
            if (lib.getNameBooks().get(i).getId() == book.getId()){
                System.out.println("Found!!!");
                return;
            }
        }
        System.out.println("Not found!!!");
    }

    public void borrowBook(Book book){
        boolean isBorrowed = false;
        for (int i = 0; i < lib.getNameBooks().size(); i++){
            if (lib.getNameBooks().get(i).getId() == book.getId()){
                borrowedBooks.add(book);
                isBorrowed = true;
            }
        }
        if (isBorrowed){
            book.setAmount(book.getAmount() - 1);
            if (book.getAmount() == 0){
                lib.getNameBooks().remove(book);
                lib.setNumberOfBooks(lib.getNameBooks().size() - 1);
            }
            System.out.println("Have borrowed");
        } else {
            System.out.println("The book is not found to borrow!!!");
        }
    }

    public void returnBook(Book book){
        for (int i = 0; i < borrowedBooks.size(); i++){
            if (borrowedBooks.get(i).getId() == book.getId()){
                book.setAmount(book.getAmount() + 1);
                borrowedBooks.remove(i);
                if (book.getAmount() == 1)
                    lib.getNameBooks().add(book);
                return;
            }
        }
        System.out.println("This book is not belong to the library");
    }
}
