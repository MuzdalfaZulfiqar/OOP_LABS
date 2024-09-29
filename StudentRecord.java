public class StudentRecord {
    private String degree;
    public StudentRecord(){

    }
    public void setDegree(String deg) {
       degree = deg;
    }
    public String getDegree(){
        return  degree;
    }
}// class ends here

class EmployeeRecord{
    private int emp_id;
    private double salary;
    public EmployeeRecord(){
    }
    public void setEmp_id(int id){
        emp_id=id;
    }
    public void setSalary(double s){
        salary = s;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public double getSalary(){
        return salary;
    }
}// class ends here
class Manager{
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;
    public  Manager(String t, double d, EmployeeRecord e, StudentRecord s){
        {
        title = t;
        dues = d;
        emp = e;
        stu = s;
        }
    }
    public void display(){
        System.out.println("Title : "+ title);
        System.out.println("Dues : "+ dues);
        System.out.println("Employee Record is as under : ");
        System.out.println("Employee Id : "+emp.getEmp_id());
        System.out.println("Employee Salary : "+emp.getSalary());
        System.out.println("Student record is as under : ");
        System.out.println("Student Degree : "+ stu.getDegree());
    }
}