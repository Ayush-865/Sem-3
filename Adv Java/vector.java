import java.util.*;

public class vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v1 = new Vector<String>();
        // Vector<String> v2 = new Vector<String>();
        System.out.println("Enter names of 10 employees:");
        String s = "";
        for (int i = 0; i < 10; i++) {
            s = sc.nextLine();
            v1.add(s);
        }
        v1.add("e11");
        v1.add("e12");
        System.out.println("two employees are added");
        v1.remove(7);
        System.out.println("employee 8 is deleted");
        Object v2 = v1.clone();
        System.out.println("vector is copied");
        System.out.println(v2);
    }
}