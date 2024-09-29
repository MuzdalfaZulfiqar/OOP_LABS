import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Pizza large = new Pizza("Large",1,1,2);
       System.out.println("Cost : "+ large.calcCost());
       System.out.println(large.getDescrition());
       Pizza medium = new Pizza("medium",3,1,2);
       System.out.println("Cost : "+ medium.calcCost());
       System.out.println(medium.getDescrition());
       Pizza small = new Pizza("small",1,4,2);
       System.out.println("Cost : "+ small.calcCost());
       System.out.println(small.getDescrition());
       System.out.print("Enter the number of pizzas you want to order : ");
       PizzaOrder p = new PizzaOrder();
       int pizzas = input.nextInt();
       p.setOrder(pizzas);
       System.out.println(p.getOrder());
       if(pizzas == 1){
          p= new PizzaOrder(small);
          System.out.println("You total cost : " + p.calTotal());
       }
       else if(pizzas == 2){
          p = new PizzaOrder(small,medium);
          System.out.println("You total cost : " + p.calTotal());

       }
       else if(pizzas == 3){
          p = new PizzaOrder(small,medium,large);
          System.out.println("You total cost : " + p.calTotal());

       }
       else{
           System.out.println("You cannot order more than 3 pizzas");
       }
    }// main ends here
}// class ends here
