package se.ulaolv.schoolManagementSystem;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int fee;
    private int feeLeft;
    private int feePaid;

    public Student(){

    }

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        fee = 300000;
        feeLeft = 300000;
        feePaid = 0;

    }

    public void payFee(int pay){
        feePaid += pay;
        feeLeft -= pay;
        //+SCHOOLINCOME UP
        School.economi += pay;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFeeLeft() {
        return feeLeft;
    }

    public void setFeeLeft(int feeLeft) {
        this.feeLeft = feeLeft;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", fee=" + fee +
                ", feeLeft=" + feeLeft +
                ", feePaid=" + feePaid +
                '}';
    }
}
