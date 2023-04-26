import java.util.ArrayList;


public class Student {
    private String name;
    private String id;
    private String address;
    public ArrayList<Course> courses;

    public Student(String name, String id, String address){
        this.name = name;
        this.id = id;
        this.address = address;
        courses = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void adds(Course c){
        courses.add(c);
    }


    public void showProfile(){
        System.out.println(name + " " + id  + " " + address);
        for (Course course : courses){
            course.showCourse();
        }
    }
}
