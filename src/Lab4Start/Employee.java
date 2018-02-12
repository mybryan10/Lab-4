package Lab4Start;

public class Employee implements Rules {

    private String name;
    private int salary;


    public Employee(){
        this("No Name", 20000 );
    }

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public String toString(){
        return "Employee: " + name + "\nSalary: " + salary;
    }
}
