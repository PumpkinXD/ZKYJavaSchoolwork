package io.github.pumpkinxd.examples.StudentManagementSystem;

import java.io.InputStreamReader;
import java.util.Scanner;

public final class StudentMangementSystem {
    static Students students;
    static Scanner scanner=new Scanner(System.in);
    static private void init(){
    //displayMenu();
    students=new Students();

    }
    static private void displayMenu(){
        System.out.println("Student Management System DEMO v0.0.1-alpha");
        System.out.println(
                """
                        1. Query(Display all students' info on the screen)
                        2. Add a new student
                        3. Remove a student(by using their ID)
                        4. Modify a student's information(by using their ID)
                        5. Quit
                        """
        );
    }
    static private void displayQuery(){
        System.out.println(students.queryAll());
    }

    static private void add(){
        System.out.println("Input New student's ID:");
        long id=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Input student's name:");
        String name=scanner.nextLine();
        System.out.println("Input student's age:");
        short age=scanner.nextShort();
        System.out.println("Input student's home address:");
        scanner.nextLine();
        String home=scanner.nextLine();
        if (students.addStudent(id,name,age,home))
        {
            System.out.println("New student added");
        }else System.out.println("Failed to add this \"new\" student(already existed!)");
    }

    static private void remove(){
        System.out.println("Input removal student's ID:");
        long id=scanner.nextLong();
        if(students.removeStudentByID(id)){
            System.out.println("Student removed");
        }else System.out.println("Failed to remove this student by ID(student is not existed)");
    }
    static private void modify(){
        System.out.println("Input student's ID:");
        long id=scanner.nextLong();
        Student student=students.getAStudent(id);
        if (student!=null){
            do{
                System.out.println("""
                        1. Change this student's name
                        2. Change this student's age
                        3. Change this student's address
                        4. Exit to the main menu
                        """);
                int choice= scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 1:
                        System.out.println("Input new name:");
                        String name=scanner.nextLine();
                        students.modifyStudentByID(id,name,student.getAge(), student.getHome());
                        break;
                    case 2:
                        System.out.println("Input new age:");
                        short age=scanner.nextShort();
                        students.modifyStudentByID(id, student.getName(), age, student.getHome());
                        break;
                    case 3:
                        System.out.println("Input new address");
                        String address=scanner.nextLine();
                        students.modifyStudentByID(id,student.getName(),student.getAge(), address);
                        break;
                    case 4:
                        return;
                    default:
                        break;
                }

            }while (true);
        }else System.out.println("the student is not exist");
    }
    public static void main(String[] args) {

        init();
        do {
            displayMenu();
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    displayQuery();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    modify();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }while (true);


    }

}
