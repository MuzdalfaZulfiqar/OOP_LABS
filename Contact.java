import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    String firstName;
    String lastName;
    int phoneNumber;
    String email;

    public Contact(){

    }
    public Contact(String firstName, String lastName, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void display(){
        System.out.println("First name : "+ firstName);
        System.out.println("Email : "+ email);
        System.out.println("Phone Number : "+ phoneNumber);
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class DataBase{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> c = new ArrayList<>();
        Contact c1 = new Contact("Ali", "Asad", 1234, "Ali@gamil.com");
        Contact c2 = new Contact("Aliyan", "Ahmed", 11234, "Aliyan@gamil.com");
        c.add(c1);
        c.add(c2);
        System.out.println("Enter : \n1. To add a contact\n2. To display all contacts" +
                "\n3. To search a contact\n4. To Delete a contact");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("Contact details : ");
            String first, last, email;
            int phone;
            System.out.print("Enter first name: ");
            first = input.next();
            System.out.print("Enter last name: ");
            last = input.next();
            System.out.print("Enter email : ");
            email = input.next();
            System.out.print("Enter phone number : ");
            phone = input.nextInt();input.nextLine();
            Contact con = new Contact(first,last,phone,email);
            c.add(con);
            System.out.print("Contact has been added..");
        }else if(option == 2){
            for(Contact p :c){
                p.display();
            }
        }
        else if (option == 3){
            System.out.print("Enter contact's first name to search : ");
            String target = input.next();
            for(Contact p : c){
                if(p.firstName.equals(target)){
                    p.display();
                }
            }
        }
        else{
            System.out.print("Enter contact's first name to delete : ");
            String target = input.next();
            for(Contact p : c){
                if(p.firstName.equals(target)){
                    c.remove(p);
                    System.out.println("The contact has been deleted");
                }

            }
        }
    }
}


