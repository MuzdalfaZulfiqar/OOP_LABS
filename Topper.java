import java.util.Scanner;
public class Topper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name[]  = new String[5];
        int marks[]  = new int[5];
        int rollNo[]  = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter name of student : "+(i+1));
            name[i] = input.next();
            System.out.println("Enter marks of student : "+(i+1));
            marks[i] = input.nextInt();
            System.out.println("Enter roll number of student : "+(i+1));
            rollNo[i] = input.nextInt();
        }// for loop ends here


        for(int i = 0; i<marks.length-1;i++){
            for(int j = i+1;j<marks.length;j++){
                if(marks[i] < marks[j]){
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;

                    String n = name[i];
                    name[i] = name[j];
                    name[j] = n;

                    int roll = rollNo[i];
                    rollNo[i] = rollNo[j];
                    rollNo[j] = roll;
                }// if ends here
            }// inner for loop ends here
        }// outer for loop ends here


        for(int t=0;t<marks.length;t++){
                System.out.println("Name : "+ name[t] + "\nMarks : "+marks[t]+ "\nRoll Number : "+ rollNo[t]);
        }// for loop ends here

    }// main ends here


}// class ends here
