import java.util.Random;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private  int id;
    private static int counter=0;




    public int getId() {

        return this.id;
    }

    public String getName() {

        return this.name;
    }

    public int getDepartment() {

        return this.department;
    }

    public int getSalary() {

        return this.salary;
    }

    public void setDepartment(int dept) {

        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public Employee(String name, int dept, int salary) {
        this.name = name;
        this.department = dept;
        this.salary = salary;
        this.id=counter++;
        id++;
    }

    @Override
    public String toString() {
        return "ФИО: " + name + " Отдел: " + department + " Зарплата: " + salary+" Id сотрудника "+id;
    }
}