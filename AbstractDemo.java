public class AbstractDemo {
    public static void main(String[] args) {
        String [] names = new String[20];
        names[0] = "Muzdalfa";
        names[1] = "Asma";
        names[2] = "Ali";
        names[3] = "Maryam";
        names[4] = "Rahat";
        NameCollection a = new NameCollection(names);

        int index = 0;
        while(a.hasNext(index)){
            System.out.println(a.getNext(index).toString());
            index++;
        }
    }
}