import java.util.*;

class Gen1 {
    static <T> void display(ArrayList<T> list) {
        for (T i : list) {
            System.out.print(i + " ");
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("a");
        l2.add("b");
        l2.add("c");
        display(l1);
        System.out.println();
        display(l2);
    }
}
