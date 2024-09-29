public class Point {
    private double x;
    private double y;
    Point(){

    }
    Point(double x1,double y1){
        x=x1;
        y=y1;
    }
    public void setX(double x1){
        x=x1;
    }
    public double getX(){
        return x;
    }
    public void setY(double y1){
        y=y1;
    }
    public double getY(){
        return y;
    }
    public void display(){
        System.out.println("x-coordinate : "+ x);
        System.out.println("y-coordinate : "+ y);
    }
}
