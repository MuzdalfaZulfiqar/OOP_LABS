public class InventoryItem implements Compare{
    private String name;
    private int uniqueItemId;
    InventoryItem(){
        name = null;
        uniqueItemId = 0;
    }
    InventoryItem(String name, int uniqueItemId){
        this.name = name;
        this.uniqueItemId = uniqueItemId;
    }
    public int getUniqueItemId(){
        return uniqueItemId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setUniqueItemId(int uniqueItemId){
        this.uniqueItemId = uniqueItemId;
    }

    public boolean compareObjects(Object o){
        InventoryItem i = (InventoryItem) o;
        if(this.name.equals(i.name) &&  i.uniqueItemId==this.uniqueItemId){
            return true;
        }
        else{
            return false;
        }
    }
}// class ends here

interface Compare{
    public boolean compareObjects(Object o);
}