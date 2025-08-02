//1.Sorting Students by Roll Number
import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {
    static class Student implements Comparable<Student>{
        String name;
        int rollNo;

        Student(String name, int rollNo)
        {
            this.name=name;
            this.rollNo=rollNo;
        }

        @Override
        public int compareTo(Student other)
        {
            return this.rollNo - other.rollNo;
        }

        @Override
        public String toString()
        {
            return name+"("+rollNo+")";
        }
    }
    public static void main(String[] args) {
        ArrayList<Student>students= new ArrayList<>();
        students.add(new Student("Alice",102));
        students.add(new Student("Bob",101));
        Collections.sort(students);
        System.out.println("Sorted names based on roll number : "+students);
    }
}
