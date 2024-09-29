import java.util.Scanner;
class Time{
    int hours;
    int minutes;
    int seconds;
    public void setParameter(int x,int y,int z){
        hours = x;
        minutes =y;
        seconds = z;
    }
    public void display(){
        System.out.println("Time is : "+hours+":"+minutes+":"+seconds);
    }
}// class ends here
public class graded2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Time t = new Time();
        System.out.println("Enter time(hours,minutes,seconds) : ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        t.setParameter(x,y,z);
        t.display();
    }// main method ends here
}// class ends here
