package se.ulaolv.schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Student viola = new Student(1, "Viola", 10);
    Student maja = new Student(2, "Maja", 11);
    Student joel = new Student(3, "Mindy", 12);
    List<Student > students = new ArrayList<>();
    students.add(viola);
    students.add(maja);
    students.add(joel);

    Teacher ola = new Teacher(1, "Ola", 44000);
    Teacher christian = new Teacher(2, "Christian", 39000);
    Teacher tina = new Teacher(2, "Tina", 42500);
    List<Teacher > teachers = new ArrayList<>();
    teachers.add(ola);
    teachers.add(christian);
    teachers.add(tina);

    School meg = new School(students, teachers);
    System.out.println("MEG has earned " + meg.getTotalMoneyEarned() + " SEK.");

    joel.payFees(500000);
    maja.payFees(350000);
    System.out.println(joel.getRemainingFees());
    System.out.println(maja.getRemainingFees());
    System.out.println(meg.getTotalMoneyEarned());

    System.out.println("--------Making MEG pay salary----------");
    tina.receiveSalary(tina.getSalary());
    System.out.println("MEG has spent " + tina.getSalary() + " SEK in salary for " + tina.getName() + " and now has " + meg.getTotalMoneyEarned() + " in the account.");





    }
}
