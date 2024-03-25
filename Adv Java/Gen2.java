    import java.util.*;

    class Gen2 {
        static <T> void isEqualTo(T t1, T t2) {
            if (t1.equals(t2)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }

        public static void main(String args[]) {
            Object o1 = new Object();
            Object o2 = new Object();
            isEqualTo(o1, o2);
            Integer i1 = 20;
            Integer i2 = 200;
            isEqualTo(i1, i2);
            String s1 = "string";
            String s2 = "string";
            isEqualTo(s1, s2);
        }
    }