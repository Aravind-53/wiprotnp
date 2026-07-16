import java.io.*;
import java.util.Date;

class Employee implements Serializable {

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth,
                    String department, String designation,
                    double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSerializationDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Aravind",
                new Date(),
                "AIML",
                "Software Engineer",
                50000.0
        );

        // Serialization
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("data.ser"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Object Serialized Successfully");

        } catch (IOException e) {
            System.out.println(e);
        }

        // Deserialization
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("data.ser"));

            Employee e = (Employee) ois.readObject();

            ois.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name : " + e.getName());
            System.out.println("Date Of Birth : " + e.getDateOfBirth());
            System.out.println("Department : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}