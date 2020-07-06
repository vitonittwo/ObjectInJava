
public class EmployeeTest
{
    public static void main(String[] args)
    {
       // create two objects off class Employee
        Employee firstEmp = new Employee ("Jon Daimond");
        Employee secondEmp = new Employee ("Eric Floor");

        // enter object parameters
        firstEmp.employeeAge(26);
        firstEmp.employeePosition("Sale director");
        firstEmp.employeeSalary(3500);

        secondEmp.employeeAge(33);
        secondEmp.employeePosition("Sale engineer");
        secondEmp.employeeSalary(2700);

        // call the method
        firstEmp.printEmployee();
        secondEmp.printEmployee();
    }

}
