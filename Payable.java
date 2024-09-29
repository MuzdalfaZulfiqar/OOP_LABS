public interface Payable {
    public double getPaymentAmount();
}

class Invoive implements Payable{
    private String partNo;
    private String partDescription;
    private int qtn;
    private double pricePerItem;

    public Invoive() {
        qtn = 10;
        pricePerItem = 20;
    }

    public Invoive(String partNo, String partDescription, int qtn, double pricePerItem) {
        this.partNo = partNo;
        this.partDescription = partDescription;
        this.qtn = qtn;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount(){
        return (qtn*pricePerItem);
    }
}
abstract class Employe implements Payable{
    private String firstName;
    private String lastName;
    private String SSN;

    public Employe() {

    }

    public Employe(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
}

class SalariedEmployee extends Employe{

    private double weeklySalary(){
        return (200.0);
    }
    public double getPaymentAmount(){
        return (weeklySalary());
    }
}
