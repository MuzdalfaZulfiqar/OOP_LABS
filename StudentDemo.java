import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int roll = 0;
        int marks = 0;
        String name;
        while(true){
            System.out.print("Enter name : ");name = input.next();
            System.out.print("Enter marks : ");marks = input.nextInt();
            System.out.print("Enter roll number : ");roll = input.nextInt();
            if(roll == -1){
                break;
            }
            Student s = new Student(roll,name,marks);
            student.add(s);
        }

        // Sort the student data
        for(int i = 0; i< student.size();i++){
            for(int j = 1; j<student.size();j++){
                if(student.get(i).marks < student.get(j).marks){
                    Student temp = student.get(i);
                    student.set(i, student.get(j));
                    student.set(j,temp);
                }
            }
        }

        // Display
        for(Student s: student){
            s.display();
        }
    }
}
