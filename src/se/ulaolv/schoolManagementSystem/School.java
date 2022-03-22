package se.ulaolv.schoolManagementSystem;

import java.util.List;

public class School {
    private static List<Student> students;
    private static List<Teacher> teachers;
    public static int economi;

    public School(){

    }
    public School(List<Student> students, List<Teacher> teachers){
        this.students = students;
        this.teachers = teachers;
        economi = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
