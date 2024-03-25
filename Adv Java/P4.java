import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void merge(LinkedList otherList) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = otherList.head;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public int getMinimum() {
        if (head == null) {
            return -1; 
        }
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public int getMaximum() {
        if (head == null) {
            return -1; 
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public LinkedList splitPassedAndFailed(int passThreshold) {
        LinkedList passedList = new LinkedList();
        Node current = head;
        while (current != null) {
            if (current.data >= passThreshold) {
                passedList.insert(current.data);
            }
            current = current.next;
        }
        current = head; 
        while (current != null) {
            if (current.data < passThreshold) {
                current.data = -1; 
            }
            current = current.next;
        }
        return passedList;
    }

    public int countAboveThreshold(int threshold) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data > threshold) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}

public class P4 {
    public static void main(String[] args) {
        LinkedList division1 = new LinkedList();
        division1.insert(85);
        division1.insert(95);
        division1.insert(70);
        division1.insert(60);
        division1.insert(80);
        LinkedList division2 = new LinkedList();
        division2.insert(75);
        division2.insert(90);
        division2.insert(65);
        division2.insert(55);
        division2.insert(100);
        System.out.println("Division 1 marks:");
        division1.display();
        System.out.println("Division 2 marks:");
        division2.display();
        division1.merge(division2);
        System.out.println("Merged marks:");
        division1.display();
        division1.sort();
        System.out.println("Sorted marks:");
        division1.display();
        int minMark = division1.getMinimum();
        int maxMark = division1.getMaximum();
        System.out.println("Minimum Mark: " + minMark);
        System.out.println("Maximum Mark: " + maxMark);
        int passThreshold = 60;
        LinkedList passedList = division1.splitPassedAndFailed(passThreshold);
        System.out.println("Passed Marks:");
        passedList.display();
        System.out.println("Failed Marks:");
        division1.display();
        int above90Count = division1.countAboveThreshold(90);
        System.out.println("Number of students getting above 90 marks: " +
                above90Count);
    }
}