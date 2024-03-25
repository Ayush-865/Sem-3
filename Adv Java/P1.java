import java.util.*;

public class P1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        System.out.println("enter number of strings");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = -1;
        for (int i = 0; i <= n; i++) {
            if (hs.add(sc.nextLine())) {
                count++;
            }
            System.out.println("unique strings:" + count);
        }
        System.out.println("total number of unique elements:" + hs.size());
        System.out.println(hs);
    }
}
