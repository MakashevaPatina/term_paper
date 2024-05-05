public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void arrayEmployees() {
        employees[0] = new Employee("Лев Николаевич Толстой", 1, 150000);
        employees[1] = new Employee("Фёдор Михайлович Достоевский", 2, 160000);
        employees[2] = new Employee("Антон Павлович Чехов", 3, 155000);
        employees[3] = new Employee("Эрнест Миллер Хемингуэй", 4, 145000);
        employees[4] = new Employee("Эрик Артур Блэр", 5, 170000);
        employees[5] = new Employee("Маргарет Элеанор Этвуд", 1, 135000);
        employees[6] = new Employee("Нелл Харпер Ли", 2, 148000);
        employees[7] = new Employee("Харуки Мураками", 3, 135000);
        employees[8] = new Employee("Фредди Меркьюри", 4, 99000);
        employees[9] = new Employee("Элвис Пресли", 5, 80000);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateTotalAmountSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public String findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary.getFullName();
    }

    public String findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary.getFullName();
    }

    public double calculateAverageSalary() {
        return calculateTotalAmountSalary() / employees.length;

    }

    public void printAllEmployeeFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexesSalaryAllEmployees(double rate) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + rate / 100));
        }
    }

    public String findEmployeeWithMinSalaryInDepartment(int department) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary.getFullName();
    }

    public String findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employeeWithMinSalary == null || employee.getSalary() > employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = employee;
                }
            }
        }
        return employeeWithMinSalary.getFullName();
    }

    public double calculateTotalAmountSalaryInDepartment(int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                count++;
            }
        }
        return calculateTotalAmountSalaryInDepartment(department) / count;
    }

    public void indexesSalaryAllEmployeesInDepartment(int department, double rate) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (1 + rate / 100));
            }
        }
    }

    public void printEmployeesInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterThan(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf("ID: %d, ФИО: %s, Зарплата: %.2f%n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    public boolean addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public String removeEmployee(int employeeID) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == employeeID) {
                employees[i] = null;
                return "Сотрудник удален";
            }
        }
        return "Сотрудник не найден";
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}

