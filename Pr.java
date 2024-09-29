public interface Pr {
    public void m();

}
interface Qr {
    public void n();

    public static void mi(){
    }
}

class st implements  Qr ,Pr{
    public void m(){
        System.out.println("d");
    }
    public void n(){

    }
}

interface Rr extends  Pr,Qr{

}
// one class can implement an interface
// one class can implement more than one interfaces this is multiple inhertance
// one class cannot extend an interface
// one interface cannot implement another interface
// one interface can extend another interface
// one interface can extend more than one interfaces