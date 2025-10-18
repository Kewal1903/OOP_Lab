package Week10;
import java.io.*;
import java.util.*;
class Employee implements Serializable {
    String name;
    int empNumber;
    double salary;
    String address;
    public Employee(String name, int empNumber, double salary, String address) {
        this.name = name;
        this.empNumber = empNumber;
        this.salary = salary;
        this.address = address;
    }
    public String toString() {
        return "Name: " + name + ", Employee Number: " + empNumber +
                ", Salary: " + salary + ", Address: " + address;
    }
}
class EmployeeManager {
    private List<Employee> employeeList = new ArrayList<>();
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
    public void sortByName() {
        Collections.sort(employeeList, Comparator.comparing(emp -> emp.name));
    }
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employeeList);
        }
    }
    public void readFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employeeList = (List<Employee>) ois.readObject();
        }
    }
    public void displayEmployees() {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
public class EmployeeFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        try {
            System.out.println("Enter number of employees: ");
            int n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for employee " + (i + 1) + ": ");
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Employee Number: ");
                int empNumber = Integer.parseInt(sc.nextLine());

                System.out.print("Salary: ");
                double salary = Double.parseDouble(sc.nextLine());

                System.out.print("Address: ");
                String address = sc.nextLine();

                manager.addEmployee(new Employee(name, empNumber, salary, address));
            }
            manager.saveToFile("employees.dat");
            manager.sortByName();
            manager.saveToFile("sorted_employees.dat");
            System.out.println("Employees sorted by name and saved to 'sorted_employees.dat'.");
            manager.displayEmployees();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter correct numeric values.");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }
    }
}
