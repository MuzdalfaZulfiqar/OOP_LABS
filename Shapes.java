import java.awt.Shape;
import java.awt.image.SampleModel;

public interface Shapes {
    double getArea();
}

class Circle1 implements Shapes{

    Circle1(){
        r = 10;
    }
    public Circle1(double r) {
        this.r = r;
    }

    public double r;
    public double getArea(){
        return (Math.PI)*(r)*(r);
    }
}
class Rectangle1 implements Shapes{
    Rectangle1(){
        len = 20;
        wid = 20;
    }
    public Rectangle1(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public double len;
    public double wid;
    public double getArea(){
        return len*wid;
    }
}