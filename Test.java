import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                Num m1 = new Num();
                System.out.println("The sum is: "+m1.sum());
                Num m2 = new Num(10,20,30);
                System.out.println("The sum is: "+m2.sum());


                Stock s = new Stock();
                double per = s.changePercent();
        System.out.println(per);

        StopWatch s1 = new StopWatch();
        s1.start(1000);
        s1.stop(2000);
        System.out.println(s1.getEndTime());
        System.out.println(s1.getStartTime());
        System.out.println(s1.elapsedTime());


//        Account a = new Account(1122,100000,0.45,2002);
//        System.out.println("Year = "+a.getDateCreated());
//        System.out.println("Id = "+a.getId());
//        System.out.println("Balance = "+a.getBalance());
//        System.out.println("Annual Rate = "+a.getAnnualInterestRate());
//        System.out.println("Monthly Rate = "+a.getMonthlyInterestRate());
//        System.out.print("Enter amount to withdraw: ");
//        int amount = input.nextInt();
//        System.out.println("Withdrawn Amount  = "+amount);
//        System.out.println("New Balance" + a.withdraw(amount));
//        System.out.print("Enter amount to withdraw: ");
//        int dep = input.nextInt();
//        System.out.println("Deposited Amount  = "+dep);
//        System.out.println("New Balance" + a.deposit(dep));
//        Fan f = new Fan();
//        f.setOn(true);
//        System.out.println(f.toString());

        Polygon p = new Polygon();
        System.out.println(Math.round(p.getArea()));
        Polygon p1 = new Polygon(6,4);
        System.out.println(p1.getArea());
        Polygon p2 = new Polygon(6,4,5.6,7.8);
        System.out.println(p2.getArea());

        QuadraticEquation q = new QuadraticEquation(10,3,2);
        int d = q.getDisc();
        if(d>0){
            System.out.println(q.getRoot1());
            System.out.println(q.getRoot2());
        }
        else if(d==0){
            System.out.println(q.getRoot1());
        }
        else{
            System.out.println("The equation has not roots");
        }

        LinearEquation lin = new LinearEquation();
        int x = lin.getX();
        int y = lin.getY();

        System.out.println("Enter the number of rows and cols");
        int row = input.nextInt();
        int column = input.nextInt();
        double [][] array = new double[row][column];
        System.out.println("Enter array elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j] =  input.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        Location l2 = Location.MaxElementFinder(array);
        System.out.println("The max value = "+ l2.maxValue +" is at ("+l2.row+","+l2.column+")");

    }// main method ends here

}// class ends here

