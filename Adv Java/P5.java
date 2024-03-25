import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getCGPA() != b.getCGPA()) {
                        return Double.compare(b.getCGPA(), a.getCGPA()); // Higher CGPA first
                    } else if (!a.getName().equals(b.getName())) {
                        return a.getName().compareTo(b.getName()); // Alphabetical order
                    } else {
                        return Integer.compare(a.getID(), b.getID()); // Lower ID first
                    }
                });
        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            } else if (parts[0].equals("SERVED")) {
                priorityQueue.poll(); // Remove the highest priority student
            }
        }
        List<Student> students = new ArrayList<>(priorityQueue.size());
        while (!priorityQueue.isEmpty()) {
            students.add(priorityQueue.poll());
        }
        return students;
    }
}

public class P5 {
    public static void main(String[] args) {
        Priorities priorities = new Priorities();
        List<String> events = Arrays.asList(
                "ENTER John 3.75 50",
                "ENTER Mark 3.5 45",
                "ENTER Steve 3.75 35",
                "SERVED",
                "SERVED",
                "ENTER Andy 3.85 55",
                "ENTER Bob 3.65 44",
                "SERVED");
        List<Student> students = priorities.getStudents(events);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}