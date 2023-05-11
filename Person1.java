interface Person1{
    String getName();
    int getAge();
}

class Student implements Person{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Teacher implements Person{
    private String name;
    private int age;

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
}

class PersonUtilities{
    public static Person getOldest(Person person1, Person person2){
        if (person1.getAge() > person2.getAge()){
            return person1;
        } else{
            return person2;
        }
    }
}

public class Main{
    public static void main(String[] args){
        Student student = new Student("Alice", 22);
        Teacher teacher = new Teacher("Bob", 45);

        Person oldest = PersonUtilities.getOldest(student, teacher);
        System.out.println("The oldest person is: " + oldest.getName() + ", age " + oldest.getAge());
    }
}