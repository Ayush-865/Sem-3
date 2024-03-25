import java.util.*;

class Gen3 {
    static <T extends Comparable<T>> void sort(T[] arr) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i].compareTo(arr[j]) == 1) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] int_arr = { 5, 1, 3, 2, 4 };
        Float[] float_arr = { 5.1f, 2.2f, 1.2f, 1f, 5.9f };
        sort(int_arr);
        sort(float_arr);
    }
}
