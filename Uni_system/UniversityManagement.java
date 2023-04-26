import java.util.ArrayList;
import java.util.Scanner;

public class UniversityManagement {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public UniversityManagement(){
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Course> getCourses(){
        return this.courses;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addStudentIntoCoure(Student student, Course course){
        course.addStudent(student);
    }
    public void addCourseforStudent(Student student, Course course){
        student.adds(course);
    }


    public void inputScoreForAssignment(Student student, Course course){
        if (student.courses.contains(course)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input score for assignments");
            
            for (int i = 0; i < 2; i++){
                int score = sc.nextInt();
                course.assignments.add(new Assignment(score));
            }
        }
    }

    public float calculateScore(Student student, Course course){
        for (Course x : student.courses){
            if (x.equals(course)){
                int sum = 0;
                for (Assignment assignment : x.assignments){
                    sum += assignment.getScore();
                }
                return (float) sum / x.assignments.size();
            }
        }
        return 0;
    }

    public void getScoreStudentFromCourse(Student student, Course course){
        ArrayList<Integer> grade = new ArrayList<Integer>();
        for (Course x : student.courses){
            if (x.equals(course)){
                for (Assignment assignment : x.assignments){
                    grade.add(assignment.getScore());
                }
            }
        }
        for (int i = 0; i < grade.size(); i++){
            System.out.println("Assignment " + i + " has score : " + grade.get(i));
        }
    }

    public void getStudentsFromCourse(Course course){
        for (int i = 0; i < course.students.size(); i++){
            System.out.println(i + ". " + course.students.get(i).getName());
        }
    }

    public void getCourseFromStudent(Student student){
        for (int i = 0; i < student.courses.size(); i++){
            System.out.println(i + ". " + student.courses.get(i).getName());
        }
    }

    public void showStudents(){
        for (Student student : students){
            student.showProfile();
            // System.out.println("\n");
        }
    }
    public void showCourses(){
        for (Course course : courses){
            course.showCourse();
            // System.out.println("\n");
        }
    }
}
