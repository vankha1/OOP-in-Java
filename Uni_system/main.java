
import java.util.Scanner;


public class main{
    public static void main(String[] args) {
        UniversityManagement university = new UniversityManagement();

        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            printMenu();
            System.out.print("Input your choice (1..6): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    university.addStudent(inPutStudent());
                    break;
                case 2:
                    university.addCourse(inPutCourse());
                    break;
                case 3:
                    university.showStudents();
                    break;  
                case 4:
                    university.showCourses();
                    break;
                case 5:
                    university.addCourseforStudent(university.getStudents().get(getStudentId()), university.getCourses().get(getCourseId()));
                    break;
                case 6: 
                    university.addStudentIntoCoure(university.getStudents().get(getStudentId()), university.getCourses().get(getCourseId()));
                    break;
                case 7:
                    university.inputScoreForAssignment(university.getStudents().get(getStudentId()), university.getCourses().get(getCourseId()));
                    break;
                case 8:
                    float score = university.calculateScore(university.getStudents().get(getStudentId()), university.getCourses().get(getCourseId()));
                    System.out.println(score);
                    break;
                case 9: 
                    university.getScoreStudentFromCourse(university.getStudents().get(getStudentId()), university.getCourses().get(getCourseId()));
                    break;
                case 10:
                    university.getCourseFromStudent(university.getStudents().get(getStudentId()));
                    break;
                case 11:
                    university.getStudentsFromCourse(university.getCourses().get(getCourseId()));
                    break;
                case 12:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 to play with");
                    break;

            }
        } while (choice != 10);
    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following funtions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Add a new course");
        System.out.println("3. Show all students");
        System.out.println("4. Show all courses");
        System.out.println("5. Add Course for Student"); 
        System.out.println("6. Add Student Into Coure"); 
        System.out.println("7. Input Score For Assignment"); 
        System.out.println("8. Calculate Score"); 
        System.out.println("9. Get Score Student From Course"); 
        System.out.println("10. Get Course From Student"); 
        System.out.println("11. Get Students From Course"); 
        System.out.println("12. Quit");
    }

    public static Student inPutStudent(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Input name of student: ");
        String nameSt = sc.nextLine();

        System.out.println("Input id of student: ");
        String idSt = sc.nextLine();

        System.out.println("Input address of student: ");
        String addressSt = sc.nextLine();

        return new Student(nameSt, idSt, addressSt);
    }

    public static Course inPutCourse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input name of course: ");
        String nameCourse = sc.nextLine();

        System.out.println("Input id of course: ");
        String idCourse = sc.nextLine();

        System.out.println("Input description of course: ");
        String descriptionCourse = sc.nextLine();

        return new Course(nameCourse, idCourse, descriptionCourse);
    }

    public static int getStudentId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input student's id you want from 0");
        int id = sc.nextInt();
        return id;
    }
    public static int getCourseId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input course's id you want from 0");
        int id = sc.nextInt();
        return id;
    }
}
