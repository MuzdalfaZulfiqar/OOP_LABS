public class Address {
    private int streetNo;
    private int houseNo;
    private int code;
    private String city;
    Address(){

    }
    Address (int street, int house, int co, String ci){
        streetNo = street;
        houseNo = house;
        code = co;
        city = ci;
    }
    public int getStreetNo(){
        return streetNo;
    }
    public void setStreetNo(int s){
        streetNo = s;
    }
    public int getHouseNo(){
        return houseNo;
    }
    public void setHouseNo(int h){
        houseNo = h;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int c){
        code = c;
    }
    public String getCity(){
        return  city;
    }
    public void setCity(String ci){
        city = ci;
    }

    public void display(){
        System.out.println("House No : "+houseNo+"\nStreet No : "+streetNo+"\nCity : "+ city+"\nCode : "+code);
    }

}
