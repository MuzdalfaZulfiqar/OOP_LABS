import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList  a = new ArrayList();
        System.out.println("Initial size of a = "+a.size());
        a.add("C");
        a.add("A");
        a.add("E");
        a.add("B");
        a.add("D");
        a.add("F");
        a.add(1,"A2");

        System.out.println("Size of al after addition : "+ a.size());
        System.out.println("Contents of a : "+ a);
        a.remove(2);
        System.out.println("Size of a after deletion : " + a.size());
        System.out.println("Contents of a "+ a);
    }
}
