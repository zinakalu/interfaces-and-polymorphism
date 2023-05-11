class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("The cat meows.");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("The dog barks.");
    }
}

public class MyClass{
    public static void main(String[] args){
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal.makeSound();
        animal.makeSound();
    }
}

//When we invoke the makeSound() method on these references, the actual implementation of the method that gets executed is determined by the type of the object the reference is pointing to. 
//So, animal1.makeSound() outputs "The cat meows" because animal1 refers to a Cat object, while animal2.makeSound() outputs "The dog barks" because animal2 refers to a Dog object.