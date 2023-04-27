package BookManagement.Lib;
import java.util.*;;

public class Worker {
    Library lib;
    ArrayList<Book> borrowedBooks;
    public Worker(Library lib){
        this.lib = lib;
        borrowedBooks = new ArrayList<>();
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
            Book temp = lib.getNameBooks().get(i);
            if (temp.getId() == book.getId()){
                temp.setAmount(temp.getAmount() - 1);
                if (temp.getAmount() == 0){
                    lib.getNameBooks().remove(temp);
                    lib.setNumberOfBooks(lib.getNameBooks().size());
                }
                borrowedBooks.add(temp);
                isBorrowed = true;
            }
        }
        if (isBorrowed){
            System.out.println("--Have borrowed !!!--");
        } else {
            System.out.println("--The book is not found to borrow!!!--");
        }
    }

    public void returnBook(Book book){
        // boolean checked = false;
        if (borrowedBooks.isEmpty()){
            System.out.println("No borrowed books!!!");
            return;
        }
        for (int i = 0; i < borrowedBooks.size(); i++){
            Book temp = borrowedBooks.get(i);
            if (temp.getId() == book.getId()){
                temp.setAmount(temp.getAmount() + 1);
                if (temp.getAmount() == 1){
                    lib.getNameBooks().add(temp);
                    lib.setNumberOfBooks(lib.getNameBooks().size());
                }
                borrowedBooks.remove(i);
                return;
            }
        }
        System.out.println("This book is not belong to the library");
    }
}
