public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    Pizza(){

    }
    Pizza(String s, int c,int p, int h){
        size = s;
        cheeseToppings = c;
        pepperoniToppings = p;
        hamToppings =h;
    }
    public String getSize(){
        return size;
    }
    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public int getPepperoniToppings(){
        return pepperoniToppings;
    }
    public int getHamToppings(){
        return hamToppings;
    }
    public void setSize(String  s){
        size = s;
    }
    public void setCheeseToppings(int c){
        cheeseToppings = c;
    }
    public void setPepperoniToppings(int p){
        pepperoniToppings = p;
    }
    public void setHamToppings(int h){
        hamToppings = h;
    }
    public double calcCost(){
        double cost;
        double costPerTopping;
        costPerTopping = 2 * (cheeseToppings + hamToppings + pepperoniToppings);
        if(size .equalsIgnoreCase("Small") ){
            cost = 10 + costPerTopping;
        }
        else if(size .equalsIgnoreCase("Medium")){
            cost = 12 + costPerTopping;
        }
        else{
            cost = 14 + costPerTopping;
        }
        return cost;
    }

    public String getDescrition(){
        String description;
        description = "Size : "+size + "\nTotal cheeseToppings : "+ cheeseToppings
        +"\nTotal pepperoniToppings : " + pepperoniToppings + "\nTotal hamToppings : "+hamToppings;

        return description;
    }
}
