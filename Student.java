public class Student {

   int rollNo;
   String name;
   int marks;
   Student(){

   }

   public Student(int rollNo, String name, int marks) {
      this.rollNo = rollNo;
      this.name = name;
      this.marks = marks;
   }

   public void display(){
      System.out.println("Name : "+ name);
      System.out.println("Roll Number : " + rollNo);
      System.out.println("Marks : "+marks);
   }
}// Student class ends here
