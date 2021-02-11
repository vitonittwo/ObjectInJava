public class Employee
{
    String name;
    int age;
    String position;
    double salary;

    /* Class Employee constructor */

    // Assigning an employee's name to variable Name
    public Employee(String name)
    {
        this.name =  name;
    }

    // Assigning an employee's age to variable Age
    public void employeeAge(int employeeAge)
    {
        age = employeeAge;
    }

// Assigning an employee's position to variable Position
    public void employeePosition(String employeePosition)
    {
        position = employeePosition;
    }

    // Assigning variable Salary
    public void employeeSalary(double employeeSalary)
    {
salary = employeeSalary;
    }

    // Information output
    public void printEmployee()
    {
        System.out.println("Employee name is:     " + name);
        System.out.println("His Age is:      " + age);
        System.out.println("His position is: " + position);
        System.out.println("His salary is:   " + salary + "\n");
    }
  }


