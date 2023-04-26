package BookManagement.Lib;

public class Book {
    private int id;
    private String name;
    private String author;
    private int amount;

    public Book(int id){
        this.id = id;
    }

    public Book(int id, String name, String author, int amount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.amount = amount;
    }
      
    public String getName(){
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", author='" + getAuthor() + "'" +
            ", amount='" + getAmount() + "'" +
            "}";
    }


}
