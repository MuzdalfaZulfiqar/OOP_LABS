public class Line {
    private Point startPoint;
    private Point endPoint;
    Line(){

    }
    Line(Point pStart,Point pEnd){
        startPoint = pStart;
        endPoint = pEnd;
    }
    public void findLength(){
        int length = (int) Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()),2) + Math.pow((endPoint.getY()-startPoint.getY()),2));
        System.out.println("Length of line is "+length);
    }
}
