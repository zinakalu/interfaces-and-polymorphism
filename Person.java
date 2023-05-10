//using an abstract class as a declared referece type for the purpose of polymorphism
public abstract class Person{
    public abstract void introduce();
}

public class Employee extends Person{
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    public void introduce(){
        System.out.println("Hello, my name is " + name + " and my employee ID is " + employeeId);
    }
}

public class Main{
    public static void main(String[] args){
        Person person1 = new Employee("John", 123);
        person1.introduce();
    }
}