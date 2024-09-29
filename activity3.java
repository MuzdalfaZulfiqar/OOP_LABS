import java.util.Scanner;
class CarPart{
    private String modelNumber;
    private String partNumber;
    private String cost;
    public void setParameter(String x, String y, String z){
        modelNumber = x;
        partNumber = y;
        cost = z;
    }// method ends here
    public void display(){
        System.out.println("Model Number : "+modelNumber
        + "\nPart Number : "+ partNumber
        + "\nCost : "+ cost);
    }// display method ends here
}// class ends here
public class activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarPart car1 = new CarPart();
        // Taking inputs for arguments in the setParameter method of class carPart
        System.out.println("What is Model Number?");
        String x = sc.nextLine();
        System.out.println("What is Part Number?");
        String y = sc.nextLine();
        System.out.println("What is Cost?");
        String z = sc.nextLine();
        car1.setParameter(x,y,z);
        car1.display();
    }// main method ends here
}// class ends here
