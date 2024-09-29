import java.util.Date;
public class StaffMember extends Employee{
    protected String title;
    StaffMember(){
//        super();
        System.out.println("After after");
        title = "NULL";
    }
    StaffMember(String name,  String address , int phone,String emailAddress,String office, int salary, Date hireDate, String title){
        super(name, address, phone, emailAddress, office, salary, hireDate);
        this.title = title;
    }
    public  void display(){
        super.display();
        System.out.println("Title : " + title);
    }
}
