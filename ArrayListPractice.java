import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MyFile.txt",true));
            Person p1 = new Person("Muzdalfa",123);
            Person p2 = new Person("Asma",124);
            Person p3 = new Person("Ali",125);

            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            System.out.println("Data added to file");
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MyFile.txt"));
            // reading whole file data
                while (true){
                    Person p1 = new Person();
                    p1 = (Person) ois.readObject();
                    p1.display();
                }

        }catch (Exception e){
            System.out.println(e.toString());
        }

//        ArrayList <Integer> al = new ArrayList<Integer>();
//        al.add(12);
//        al.add(13);
//        al.add(14);
//        al.add(1,10);  // put value at index 1 after shifting value to right
//        al.set(1,11);// replace value at index 1
//        for(int n:al){
//            System.out.println(n);
//        }
//        al.remove(1);
//        for(int n:al){
//            System.out.println(n);
//        }
    }

}
