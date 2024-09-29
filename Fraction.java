public class Fraction {
    private int numerator;
    private int denominator;
    Fraction(){
        numerator = 0;
        denominator = 0;
    }
    Fraction(int n,int d){
        numerator = n;
        denominator =d ;
    }
    public void setNumerator(int n){
        numerator = n;
    }
    public void setDenominator(int d){
        denominator = d;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public  void display(){
        System.out.println("Fraction = " + numerator + " / "+denominator);
    }// method ends here
    public boolean equals(int fraction){
        if((numerator/denominator) == fraction){
            return true;
        }
        else{
            return false;
        }
    }// method ends here

}
