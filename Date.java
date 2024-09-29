//
//public class Date {
//    private int day;
//    private int year;
//    private int month;
//    private int checkMonth(int m){
//        if(m>0 && m<=12){
//            return m;
//        }
//        else{
//            System.out.println("Invalid Month "+ m + " set to 1");
//            return 1;
//        }
//    }
//    private int checkDay(int d) {
//        if (checkMonth(month) == 1 || checkMonth(month) == 3 || checkMonth(month) == 5 || checkMonth(month) == 7
//                || checkMonth(month) == 8 || checkMonth(month) == 10 || checkMonth(month) == 12) {
//            if (d > 0 && d <= 31) {
//                return d;
//            }
//        } else if (checkMonth(month) == 2) {
//            if (year % 4 == 0) {
//                if (d > 0 && d <= 29) {
//                    return d;
//                }
//            } else {
//                if (d > 0 && d <= 28) {
//                    return d;
//                }
//            }
//        } else if (checkMonth(month) == 4 || checkMonth(month) == 6 || checkMonth(month) == 9 || checkMonth(month) == 11) {
//            if (d > 0 && d <= 30) {
//                return d;
//            }
//        }
//        System.out.println("Invalid date set to 1");
//        return 1;
//    }
//    public Date(int m, int d, int y){
//        day = checkDay(d);
//        month = checkMonth(m);
//        year = y;
//    }
//    public int getDay() {
//        return day;
//    }
//    public int getYear(){
//        return year;
//    }
//    public int getMonth(){
//        return month;
//    }
//
//    public void display(){
//        System.out.println(day +" "+month+" "+year);
//    }
//}// public class ends here
//
//class MyInteger{
//    int value;
//    MyInteger(){
//        value = 0;
//    }
//    MyInteger(int v){
//        value = v;
//    }
//    public boolean isEven(){
//        if(value%2==0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean isOdd(){
//        if(value%2==1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public boolean isPrime(){
//        int f=  0;
//        for(int i=2;i<value/2;i++){
//            if(value%i==0){
//                f++;
//            }
//        }
//        if(f==0){
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//    public static boolean isEven(int v){
//        if(v%2==0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static boolean isOdd(int v){
//        if(v%2==1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static  boolean isPrime(int v){
//        int f=  0;
//        for(int i=2;i<v/2;i++){
//            if(v%i==0){
//                f++;
//            }
//        }
//        if(f==0){
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//    public static boolean isEven(MyInteger v){
//        if(v.value%2==0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public  static boolean isOdd(MyInteger v){
//        if(v.value%2==1){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static boolean isPrime(MyInteger v){
//        int f=  0;
//        for(int i=2;i<v.value/2;i++){
//            if(v.value%i==0){
//                f++;
//            }
//        }
//        if(f==0){
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }
//    public void equals(int v){
//        if(v==value){
//            System.out.println("Yes");}
//        else{
//            System.out.println("No");
//        }
//    }
//    public void equals(MyInteger v){
//        if(v.value==value){
//            System.out.println("Yes");}
//        else{
//            System.out.println("No");
//        }
//    }
//}
//

