package list;

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class EmployeeVector {
    public static void main(String[] args) {

        Vector<Employee> v = new Vector<>();

        v.add(new Employee(101, "Aravind"));
        v.add(new Employee(102, "Rahul"));
        v.add(new Employee(103, "Kiran"));

        System.out.println("Using Iterator");

        Iterator<Employee> it = v.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee> en = v.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}