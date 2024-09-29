class CourseResult {
    public String studentName;
    public String courseName;
    public String grade;

    public void display(){
        System.out.println("Student Name is: "+studentName+
                "\nCourse Name is : "+ courseName
        + "\nGrade is : "+grade);
    }// display method ends here
}// courseResult class ends here

public class activity1 {
    public static void main(String[] args) {
        CourseResult c1 = new CourseResult();
        c1.courseName = "OOP";
        c1.studentName = "Muzdalfa Zulfiqar";
        c1.grade="A";
        c1.display();

        CourseResult c2 = new CourseResult();
        c2.studentName = "Saba";
        c2.courseName = "ICP";
        c2.grade= "A+";
        c2.display();

    }// main method ends here
}// public class ends here
