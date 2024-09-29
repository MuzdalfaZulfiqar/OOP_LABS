public class NameCollection {
    String [] names;
    NameCollection(){
        names = new String[100];
    }
    NameCollection(String [] names){
        this.names = names;
    }
    public boolean hasNext(int index){
        if(index < names.length && names[index] != null){
            return true;
        }
        else{
            return false;
        }
    }
    public Object getNext(int index){
        if(hasNext(index)){
            String s = names[index];
            Object o = (Object) s;
            return o;
        }
        else{
            return null;
        }
    }

}

interface Enumeration{
    public boolean hasNext(int index);
    public Object getNext(int index);
}