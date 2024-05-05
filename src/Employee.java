import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(String fullName, int departments, double salaries) {
        this.department = departments;
        this.fullName = fullName;
        this.salary = salaries;
        this.id = counter++;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public final int getId() {
        return id;
    }

    public void setDepartments(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            System.out.println("Ошибка");
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Ошибка");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d ФИО: %s Отдел: %s Зарплата: %s ", id, fullName, department, salary);
    }
}
