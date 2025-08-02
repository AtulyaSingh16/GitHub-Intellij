import java.util.TreeSet;

public class Comparable4 {
    static class Employee implements Comparable<Employee>
    {
        String name;
        double salary;

        Employee(String name, double salary)
        {
            this.name=name;
            this.salary=salary;
        }

        @Override
        public int compareTo(Employee other)
        {
            return Double.compare(this.salary,other.salary);
        }

        public String toString()
        {
            return name+"("+salary+")";
        }
    }
    public static void main(String[] args) {
        TreeSet<Employee> employees= new TreeSet<>();
        employees.add(new Employee("Bob",60000));
        employees.add(new Employee("Alice",50000));
        System.out.println("Sorted Employee : "+employees);
    }
}
