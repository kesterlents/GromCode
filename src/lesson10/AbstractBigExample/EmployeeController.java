package lesson10.AbstractBigExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public class EmployeeController {
    private Employee[] employees = new Employee[100];

    void paySalaryToEmployess() {
        for (Employee employee : employees) {
            employee.paySalary();
            System.out.println("Salary was paid successfully to " + employee.getName() + "employee");
        }

       /* void paySalaryToEmployess () {
            for (Employee employee : employees) {
                if (employee instanceof DeveloperEmployee) {
                    int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth() + 1000;
                    employee.getBankAccount().setBalance(newBalance);
                } else if (employee instanceof ManagerEmployee) {
                    int newBalance = employee.getBankAccount().getBalance() + employee.getSalaryPerMonth();
                    newBalance += newBalance * 0.25;
                    employee.getBankAccount().setBalance(newBalance);
                }

                Sys.out.println("Salary was paid successfully to " + employee.getName() + "employee");
            }*/
    }


}
