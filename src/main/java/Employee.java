import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("John Wick", "tailor", "XXX",
                "JohnWick@mail.ru", 100000000, 45);
        employee.printEmployee(employee);
        System.out.println("________________________________________________________________________________" );

        Employee[] massive = new Employee[5];
        massive[0] = new Employee("John Carter", "tailor", "XXXX",
                "JohnCarter@mail.ru", 100000000, 40);
        massive[1] = new Employee("John Carter1", "tailor", "XXXX",
                "JohnCarter1@mail.ru", 100000000, 40);
        massive[2] = new Employee("John Carter2", "tailor", "XXXX",
                "JohnCarter2@mail.ru", 100000000, 40);
        massive[3] = new Employee("John Carter3", "tailor", "XXXX",
                "JohnCarter3@mail.ru", 100000000, 40);
        massive[4] = new Employee("John Wick", "tailor", "XXX",
                "JohnWick@mail.ru", 100000000, 45);

        for (int i = 0; i < massive.length; i++) {
            if (massive[i].age > 40) {
                System.out.println("employee: " + massive[i].name + massive[i].position +
                        "employee's age: " + massive[i].age + "employee's salary: " + massive[i].salary +
                        "employee's contacts: " + massive[i].email + massive[i].phoneNumber);
            }
        }
    }

    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String phoneNumber, String email, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }


    void printEmployee(Employee employee) {
        System.out.println("employee: " + employee.name + employee.position);
        System.out.println("employee's contacts: " + employee.email + employee.phoneNumber);
        System.out.println("employee's age: " + employee.age);
        System.out.println("employee's salary: " + employee.salary);
    }
}
