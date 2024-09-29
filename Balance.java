public class Balance {
    public int balance;
    public Balance(){
        balance=1000000;
    }
    public Balance(int money){
        balance = money;
    }
    public void withdraw(int amountWithDraw){
        balance = balance-amountWithDraw;
        System.out.println("After withdrawing "+amountWithDraw+"\nNew Balance is "+balance);
    }

    public void deposit(int amountDeposit){
        balance = balance+amountDeposit;
        System.out.println("New Balance is "+balance);
    }
}// class ends here


class Stock{
    String name;
    String symbol;
    double PreviousClosingPrice;
    double currentPrice;


    Stock(){
        name = "ORACLE";
        symbol = "**-|-**";
        PreviousClosingPrice = 10000;
        currentPrice = 10000;

    }
    public Stock(String n, String s, double p, double c) {
        name = n;
        symbol = s;
        PreviousClosingPrice = p;
        currentPrice = c;
    }

    public double changePercent() {
        double percent;
        percent = (currentPrice - PreviousClosingPrice) / 100;
        return percent;
    }
}

class StopWatch{
    private int startTime,endTime;

    StopWatch(){
        startTime = 1000;
        endTime = 2000;
    }
    StopWatch(int s ,int e){
        startTime = s;
        endTime = e;
    }
    public int getStartTime(){
        return startTime;
    }
    public int getEndTime(){
        return endTime;
    }
    public int start(int s){
        startTime = s;
        return startTime;
    }
    public int stop(int e){
        endTime = e;
        return endTime;
    }
    public int elapsedTime(){
        int elapsed = endTime-startTime;
        return elapsed;
    }
}
//
//class Account{
//    private int id;
//    private double balance;
//    private  double annualInterestRate;
//    private Date dateCreated = new Date();
//    Account(){
//        id = 0;
//        balance = 0;
//        annualInterestRate = 0;
//        dateCreated.year=2002;
//
//    }
//    Account(int i,double b,double a, int d){
//        id = i;
//        balance = b;
//        annualInterestRate = a;
//        dateCreated.year=d;
//    }
//    public void setId(int i){
//        id = i;
//    }
//    public void setBalance(double b){
//        balance = b;
//
//    }
//    public void setAnnualInterestRate(double a){
//        annualInterestRate = a;
//    }
//    public int getId(){
//        return id;
//    }
//    public double getBalance(){
//        return balance;
//    }
//    public double  getAnnualInterestRate(){
//        return annualInterestRate;
//    }
//    public int getDateCreated(){
//        Date d = new Date();
//        return d.year;
//    }
//    public double getMonthlyInterestRate(){
//        double monIntRate;
//        monIntRate = annualInterestRate/12;
//        return monIntRate;
//    }
//    public double withdraw(int a){
//        double amount = balance-a;
//        return amount;
//    }
//    public double deposit(int a){
//        double amount = balance+a;
//        return amount;
//    }
//}
class Fan{
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int HIGH= 3;
    private int speed;
    private boolean on;
    private double radius;
    public String color;
    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }
    public void setSpeed(int s){
        speed = s;
    }
    public int getSpeed(){
        return speed;
    }
    public void setOn(boolean o){
        on = o;
    }
    public boolean getOn(){
        return on;
    }
    public void setColo(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public String toString(){
        String s;
        if(on){
            s = "Color = "+color+"\nSpeed = "+speed+"\nRadius = "+radius;
        }
        else{
            s = "fan is Off";
        }
        return s;
    }
}
class Polygon{
    private int n;
    private double side;
    private double x;
    private double y;
    Polygon(){
        n=3;
        side = 1;
        x=0;
        y=0;
    }
    Polygon(int n1,double s1){
        n=n1;
        side = s1;
        x = 0;
        y = 0;

    }
    Polygon(int n1,double s1, double x1, double y1){
        n=n1;
        side = s1;
        x = x1;
        y = y1;
    }
    public void setN(int N){
        n=N;
    }
    public int getN(){
        return n;
    }
    public void setSide(int s){
       side = s;
    }
    public double getSide(){
        return side;
    }
    public void setX(int x1){
       x= x1;
    }
    public double getX(){
        return x ;
    }
    public void setY(int y1){
       y= y1;
    }
    public double getY(){
        return y ;
    }
    public double getArea(){
        double area;
        area = (n*Math.pow(side,2))/4*Math.tan(Math.PI/n);
        return area;
    }
}
class QuadraticEquation{
    private int a;
    private int b;
    private int c;
    QuadraticEquation(){
        a=0;
        b=0;
        c=0;
    }
    QuadraticEquation(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getDisc(){
        int disc;
        disc = b*b-4*a*c;
        return disc;
    }
    public double getRoot1(){
        double root2;
        int disc = b*b-4*a*c;
        if(disc >=0){
            root2 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        }
        else{
            root2 = 0;
        }
        return root2;
    }
    public double getRoot2(){
        double root2;
        int disc = b*b-4*a*c;
        if(disc >=0){
            root2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        }
        else{
            root2 = 0;
        }
        return root2;
    }
}

class LinearEquation{
    int a,b,c,d,e,f;
    LinearEquation(){
        a=1;b=2;
        c=3;d=4;
        e=5;f=5;
    }
    public int getX(){
        int x = ((e*d)-(b*f))/((a*d)-(b*c))  ;
        return x;
    }
    public int getY(){
        int y = ((a*f)-(e*c))/((a*d)-(b*c))  ;
        return y;
    }
}
class Location{
    double maxValue;
    int row;
    int column;


    public static Location MaxElementFinder(double [][]array){
        Location l = new Location();
        l.maxValue = array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]>l.maxValue){
                    l.maxValue  = array[i][j];
                    l.row = i;
                    l.column = j;
                }
            }
        }
        System.out.println(l. maxValue);
        return l;
    }
}

class Course{
    private String courseName;
    private int numberOfStudents;
    private  Student student[];
    Course(){
        courseName = "";
        numberOfStudents = 0;
        student = new Student[100];
    }
    public void setCourseName(String s) {
        courseName = s;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void addStudent(Student s){
        student[numberOfStudents] = s;
        numberOfStudents++;
    }
}