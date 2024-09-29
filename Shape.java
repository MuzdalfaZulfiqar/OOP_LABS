public abstract class Shape {
    int numberOfLines;
    String penColor;
    String fillColor;
    Shape(){
        numberOfLines = 2;
        penColor = "Pink";
        fillColor = "Yellow";
    }

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    abstract void draw();
}

class Circle extends Shape{
    public void draw(){
        System.out.println("This is a circle..");
    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("This is a Square..");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("This is a Triangle..");
    }
}
