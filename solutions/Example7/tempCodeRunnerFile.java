package Example7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

}


public class Main {
    public static void main(String[] args) {
        // Sample employee data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Smith", 101));
        employees.add(new Employee("Bob", "Jones", 102));
        employees.add(new Employee("Adam", "Johnson", 103));
        employees.add(new Employee("Amy", "Brown", 104));

        // Using filter streams to print full name of employees whose firstName starts with 'A'
        List<String> fullNameOfEmployeesStartingWithA = employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .collect(Collectors.toList());

        // Printing full names
        System.out.println("Full names of employees whose firstName starts with 'A':");
        fullNameOfEmployeesStartingWithA.forEach(System.out::println);
    }
}