import java.util.Date;

public class FacultyMember extends Employee{
    protected int officeHours;
    protected String rank;

    public FacultyMember(int officeHours, String rank) {
        super();
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public FacultyMember(String name, String address, int phone, String emailAddress, String office, int salary, Date hireDate, int officeHours, String rank) {
        super(name, address, phone, emailAddress, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public int getOfficeHours(){
        return officeHours;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public void setOfficeHours(int officeHours){
        this.officeHours = officeHours;
    }
    public void display(){
        super.display();
        System.out.println("Office Hours : "+ officeHours);
        System.out.println("Rank : "+ rank);
    }
}
