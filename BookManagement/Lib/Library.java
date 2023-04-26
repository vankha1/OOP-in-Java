package BookManagement.Lib;
import java.util.*;

public class Library {
    private String name;
    private Integer numberOfBooks;
    private ArrayList<Book> nameBooks;

    public Library(String name, Integer numberOfBooks) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.nameBooks = new ArrayList<Book>();
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfBooks() {
        return this.numberOfBooks;
    }

    public void setNumberOfBooks(Integer numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public ArrayList<Book> getNameBooks() {
        return this.nameBooks;
    }

    public void setNameBooks(ArrayList<Book> nameBooks) {
        this.nameBooks = nameBooks;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", numberOfBooks='" + getNumberOfBooks() + "'" +
            ", nameBooks='" + getNameBooks() + "'" +
            "}";
    }

}
