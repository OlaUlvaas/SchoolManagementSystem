package se.ulaolv.schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student joel = new Student(1, "Joel", 10);
        Student maja = new Student(2, "Maja", 11);
        Student viola = new Student(3, "Viola", 10);

        Teacher ola = new Teacher(1, "Ola", 44000);
        Teacher christian = new Teacher(2, "Christian", 39000);
        Teacher tina = new Teacher(3, "Tina", 42000);

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        students.add(joel);
        students.add(maja);
        students.add(viola);

        teachers.add(ola);
        teachers.add(christian);
        teachers.add(tina);



        School meg = new School(students, teachers);





        System.out.println(joel.getGrade());
        System.out.println(joel.getFeeLeft());
        System.out.println(joel.getFeePaid());
        System.out.println(maja.getName());
        System.out.println(viola.getGrade());
        maja.payFee(10000);
        joel.payFee(65000);
        System.out.println(School.economi);
        System.out.println(maja.getFeeLeft());
        System.out.println(joel.getFeeLeft());
        System.out.println("***TEACHERS***");
        System.out.println(tina.getName());
        System.out.println(christian.getId());
        System.out.println(ola.getSalary());
        System.out.println(ola.earnMoney(ola.getSalary()));
        System.out.println(School.economi);
        System.out.println(ola.earnMoney(ola.getSalary()));
        System.out.println(School.economi);

        System.out.println(meg.getStudents());
        System.out.println(meg.getTeachers());


    }
}
