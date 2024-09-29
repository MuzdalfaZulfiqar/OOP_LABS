public class Mytime {
    int hours;
    int min;
    int seconds;

    public Mytime(){
        hours=5;
        min=34;
        seconds = 60;
    }
    public Mytime(int h, int m, int s){
        hours=h;
        min=m;
        seconds = s;
    }
    public boolean setValidTime(){
        boolean isValid = false;
        if(hours>=1 && hours<=12){
            if(min>=1 && min<=60){
                if(seconds>=1 && seconds<=60){
                    isValid=true;
                }
            }
            else{
                isValid = false;
            }
        }
        else{
            isValid = false;
        }

        return  isValid;
    }

    public void display(){
        System.out.println(hours+" : "+min+" : "+seconds);
    }
}// class ends here

class Num {
    int m1, m2, m3;
    public Num() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
    }
    public Num(int mark1, int mark2, int mark3) {
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
    }
    public int sum() {
        return m1 + m2 + m3;
    }
}

