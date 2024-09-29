import java.util.Date;

public class Employee  {
   protected  String office;
    protected int salary;
    protected   Date hireDate;
   Employee(){
       super();
       office = "Lahore";
       salary = 0;
       hireDate  = new Date(1,28,2001);

   }// default constructor
    Employee(String name,  String address , int phone,String emailAddress,String office, int salary, Date hireDate ){
//        super(name, address,phone, emailAddress);
        this.hireDate = hireDate;
        this.office = office;
        this.salary = salary;
    }
    public  void display(){
//       super.display();
        System.out.println("Salary : "+ salary);
        System.out.println("Hire Date : "+ hireDate.getDay() + "/"+ hireDate.getMonth());
        System.out.println("Office : "+ office);
    }
}// class ends here
