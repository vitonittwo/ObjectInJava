
public class EmployeeTest
{
    public static void main(String[] args)
    {
       // create three objects off class Employee
        Employee firstEmp = new Employee ("Jon Daimond");
        Employee secondEmp = new Employee ("Eric Floor");
        Employee thirdEmp = new Employee ("Dona Ripply");

        // enter object parameters
        firstEmp.employeeAge(26);
        firstEmp.employeePosition("Sale director");
        firstEmp.employeeSalary(3500);

        secondEmp.employeeAge(33);
        secondEmp.employeePosition("Sale engineer");
        secondEmp.employeeSalary(2700);

        thirdEmp.employeeAge(29);
        thirdEmp.employeePosition("Sale manager");
        thirdEmp.employeeSalary(2700);

        // call the method
        firstEmp.printEmployee();
        secondEmp.printEmployee();
        thirdEmp.printEmployee();


    }

}
