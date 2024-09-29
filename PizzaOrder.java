public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;
    public int order;
    PizzaOrder(){

    }
    PizzaOrder(Pizza pA){
        p1 = pA;
    }
    PizzaOrder(Pizza pA,Pizza pB){
        p1 = pA;
        p2 = pB;
    }
    PizzaOrder(Pizza pA, Pizza pB, Pizza pC ){
        p1 = pA;
        p2 = pB;
        p3 = pC;
    }

    public void setOrder(int o) {
        order = o;
    }
    public int getOrder(){
        return order;
    }
    public double calTotal(){
        double cost;
        double cost2 = 0;
        double cost3 = 0;
        if(p2 == null){
           cost2 = 0 ;
        }
        else{
            cost2 = p2.calcCost();
        }
        if(p3 == null){
            cost3 = 0 ;

        }
        else{
            cost3 = p3.calcCost();
        }
        if(getOrder() == 1){
            cost = p1.calcCost() + cost2 + cost3;
        }
        else if(getOrder() == 2){
            cost = p1.calcCost() + cost2 + cost3;
        }
        else{
            cost = p1.calcCost() + cost2 + cost3;
        }
        return cost;
    }
}
