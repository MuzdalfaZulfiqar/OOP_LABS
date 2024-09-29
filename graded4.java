class Rect{
    int lenght;
    int width;
    public int area;
    public int area(){
        area = lenght*width;
        return area;
    }
    public void display(){
        System.out.println("Length = "+lenght
        +"\nWidth = "+width
        + "\nArea = "+area);
    }
}
public class graded4 {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.width =10;
        r.lenght = 10;
        r.area();
        r.display();
    }// main method ends here
}// class ends here
