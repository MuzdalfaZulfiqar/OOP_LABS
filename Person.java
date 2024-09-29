import java.io.Serializable;

public class Person implements Serializable {
    protected String  name;
//    protected String address;
    protected int phone;
//    protected String emailAddress;
    public Person(){
//        System.out.println("MUZDALFA frokm parent class" +
//                "" +
//                " ");
//        name = "Muzdalfa Zulfiqar";
//        address = "NULL";
//        phone = 12345;
//        emailAddress = "ABC@gamil.com";
    }
    Person(String n, int p){
        name = n;
//        address = a;
        phone = p;
//        emailAddress  = e;
    }
    public void setName(String n){
        name = n;
    }
    public  String getName(){
        return name;}
    public void setPhone(int p){
        phone = p;
    }
    public int getPhone(){
        return phone;
    }
//    public String getAddress() {
//        return address;
//    }
//   public void setAddress(String address)
//   {
//       this.address = address;
//   }

//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }

    public void display(){

        System.out.println("Name : "+ name);
        System.out.println("Phone : "+phone);
//        System.out.println("Address : "+ address);
//        System.out.println("Email Address : "+emailAddress);
    }

    public static void check(){
        System.out.println("I am a static method");
    }
}
