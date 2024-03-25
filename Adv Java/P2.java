import java.util.*;
class Student {}
class Rockstar {}
class Hacker {}

public class P2 {
    public static void main(String[] args) {
        ArrayList<Object> people = new ArrayList<Object>();
        people.add(new Student());
        people.add(new Student());
        people.add(new Hacker());
        people.add(new Student());
        people.add(new Rockstar());
        count(people);
    }

    public static void count(ArrayList<Object> people) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;
        for (Object person : people) {
            if (person instanceof Student) {
                studentCount++;
            } else if (person instanceof Rockstar) {
                rockstarCount++;
            } else if (person instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.println("Student count: " + studentCount);
        System.out.println("Rockstar count: " + rockstarCount);
        System.out.println("Hacker count: " + hackerCount);
    }
}
