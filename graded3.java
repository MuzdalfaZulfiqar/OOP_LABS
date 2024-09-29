class Car{
    String name;
    String model;
    String price;
    String color;
    public void display(){
        System.out.println("Name : "+name+
                "\nModel : "+model
        + "\nPrice : "+ price
        + "\nColor : "+color);
    }// display method ends here
}// class ends here

public class graded3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Bugati";
        c1.color = "Blue";
        c1.price = "Aukaat se bahir";
        c1.model = "SW22";
    }// main method ends here
}// class ends here
