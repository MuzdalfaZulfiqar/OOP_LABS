
public class HotDogStand {
    int standID;
    int hotDogsSold;
    HotDogStand(){
        standID = 1;
        hotDogsSold=0;
    }
    HotDogStand(int id,int sold){
        standID = id;
        hotDogsSold = sold;
    }
    public void justSold(){
        hotDogsSold++;
    }
    public int getHotDogsSold(){
        return hotDogsSold;
    }
}// class ends here
