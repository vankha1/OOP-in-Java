package StudentAge;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int year = sc.nextInt();
            sc.nextLine();
            arr[i] = new Student(name, year);
            System.out.println(name);
        }

        int sumAge = 0;
        for (Student student : arr) {
            System.out.println(student.toString() + "\n");
            sumAge += 2023 - student.getYear();
        }
        System.out.println(sumAge);
    }
}
