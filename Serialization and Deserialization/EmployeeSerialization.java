import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;
    static int employeeCount = 0;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Step 1: Create employee object
        Employee emp1 = new Employee(1, "Rahul Sharma", 30000);

        // Step 2: Serialize the object
        ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out1.writeObject(emp1);
        out1.close();
        System.out.println("\n✅ Employee serialized to file.");

        // Step 3: Deserialize the object
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee emp2 = (Employee) in1.readObject();
        in1.close();

        System.out.println("\n🔍 Deserialized Employee:");
        emp2.display();

        // Step 4: Update salary
        emp2.salary += 1000;

        // Step 5: Serialize updated object again
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out2.writeObject(emp2);
        out2.close();
        System.out.println("\n💰 Salary updated and re-serialized.");

        // Step 6: Read again to verify
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee emp3 = (Employee) in2.readObject();
        in2.close();

        System.out.println("\n📂 Final Employee Data from file:");
        emp3.display();
    }
}
