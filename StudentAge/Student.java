package StudentAge;

public class Student {
    private String name;
    private int year;
    
    Student(){}
    Student(String name, int year){
        this.name = name;
        this.year = year;
    }
    String getName(){
        return this.name;
    }
    int getYear(){
        return this.year;
    }
    void setName(String name){
        this.name = name;
    }
    void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
}
