public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.arrayEmployees();

        System.out.println("\nБазовая сложность");
        System.out.println("\nСписок всех сотрудников");
        employeeBook.printAllEmployees();
        System.out.printf("\nСумма затрат на ЗП в месяц: %.2f\n", employeeBook.calculateTotalAmountSalary());
        System.out.printf("\nСотрудник с минимальной ЗП: %s\n", employeeBook.findEmployeeWithMinSalary());
        System.out.printf("\nСотрудник с максимальной ЗП: %s\n", employeeBook.findEmployeeWithMaxSalary());
        System.out.printf("\nСреднее значение зарплат: %.2f\n", employeeBook.calculateAverageSalary());
        System.out.println("\nФИО всех сотрудников:");
        employeeBook.printAllEmployeeFullName();

        System.out.println("\nПовышенная сложность");
        System.out.println("\nИндексирование зарплат у всех сотрудников на величину аргумента в %");
        employeeBook.indexesSalaryAllEmployees(5);
        System.out.printf("\nСотрудник с минимальной зп в указанном отделе: %s\n", employeeBook.findEmployeeWithMinSalaryInDepartment(4));
        System.out.printf("\nСотрудник с максимальной зп в указанном отделе: %s\n", employeeBook.findEmployeeWithMaxSalaryInDepartment(3));
        System.out.printf("\nСредняя зп по указанному отделу: %.2f\n", employeeBook.calculateAverageSalaryInDepartment(4));
        System.out.println("\nИндексирование зарплат в отделе 2 на 3%:");
        employeeBook.indexesSalaryAllEmployeesInDepartment(2, 3);
        employeeBook.printEmployeesInDepartment(2);
        System.out.println("\nСотрудники с зарплатой меньше 160000:");
        employeeBook.printEmployeesWithSalaryLessThan(160000);
        System.out.println("\nСотрудники с зарплатой больше 160000:");
        employeeBook.printEmployeesWithSalaryGreaterThan(160000);

        System.out.println("\nОчень сложно");
        System.out.println("\nДобавление нового сотрудника:");
        boolean newEmployee = employeeBook.addNewEmployee(new Employee("Набоков Владимир Владимирович", 5, 156000));
        if (newEmployee) {
            System.out.println("Сотрудник добавлен");
        } else {
            System.out.println("Нет свободных мест");
        }
        System.out.println("\nУдаление сотрудника по ID:");
        System.out.println(employeeBook.removeEmployee(6));
        System.out.println("\nПолучение сотрудника по ID:");
        System.out.println(employeeBook.findEmployeeById(5));

    }
}
