package Lab4Start;

/**
 * Name: Jaime Ortiz-Chavez
 * Date: 2/13/2018
 *
 * Sources:
 * Inheritance.zip
 * Lab-4 Video
 *
 * Description:
 * Represents a Employee's information such as their name and salary.
 * It also implements rules.
 *
 * Algorithm:
 * make it implement rules
 * make two data members: Salary and name.
 * Make a default constructor and another constructor suing name and salary.
 * Make a getName method and a getSalary method that returns that variable.
 * Lastly make a toString that returns the employee's information neatly.
 *
 * Lab: 4
 * Spring 2018
 * CSIT 150
 *
 * @author Jaime Ortiz-Chavez
 */

public class Employee implements Rules {

    //Variables for the class
    private String name;
    private int salary;


    /**
     * Default Constructor
     */
    public Employee() {
        this("No Name", 20000);
    }

    /**
     * A Constructor for Employee
     *
     * @param name
     * @param salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    /**
     * @return the name of the Employee
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the salary of the Employee
     */
    @Override
    public int getSalary() {
        return salary;
    }

    /**
     * @return a string that contains that contains the employee information
     */
    public String toString() {
        return "Employee: " + name + "\nSalary: " + salary;
    }
}
