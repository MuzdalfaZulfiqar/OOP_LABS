
interface RegisterForExams{
    public void register();
}

public class EmployeeTask implements RegisterForExams {
    private String name;
    private String date;
    private int salary;
    public EmployeeTask(){
        name = null;
        date = null;
        salary = 0;
    }

    public EmployeeTask(String name, String date, int salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public void register(){
        System.out.println("Employee is Registered"+"\nName = "+ name+"\nSalary = "+salary);
    }
}

class StudentTask implements RegisterForExams{
    private String name;
    private int age;
    private int gpa;
    StudentTask(){
        name = null;
        age = 0;
        gpa = 0;
    }

    public StudentTask(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void register(){
        System.out.println("Student is Registered"+"\nName = "+ name+"\nGpa = "+gpa);
    }
}