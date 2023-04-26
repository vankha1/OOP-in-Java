import java.util.ArrayList;

public class Course {
    private String name;
    private String id;
    private String description;
    public ArrayList<Student> students;
    public ArrayList<Assignment> assignments; // Given a course has 2 assignments

    public Course(String name, String id, String description){
        this.name = name;
        this.id = id;
        this.description = description;
        students = new ArrayList<Student>();
        assignments = new ArrayList<Assignment>();
    }

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getdescription(){
        return this.description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setdescription(String description){
        this.description = description;
    }
    public void addStudent(Student s){
        students.add(s);
    }

    public void showCourse(){
        System.out.println(name + " " + id + " " + description);
    }
}