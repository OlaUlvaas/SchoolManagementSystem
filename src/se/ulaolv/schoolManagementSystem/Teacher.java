package se.ulaolv.schoolManagementSystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int moneyEarned;

    public Teacher(){

    }
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int earnMoney(int money){
        moneyEarned += money;
        //SCHOOL INCOME DOWN;
        School.economi -= money;
        return moneyEarned;
    };


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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
