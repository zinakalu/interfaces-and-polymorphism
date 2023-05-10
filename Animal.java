//code example of using a superclass type as a method argument, return type, and array type
public abstract class Animal{
    public abstract void makeSound();
}

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }
}

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow!");
    }
}

public class AnimalShelter{
    public Animal adoptAnimal(){
        //returns an Animal object
        return new Dog();
    }

    public void feedAnimal(Animal animal){
        //takes an Animal object as an argument
        animal.makeSound();
    }

    public Animal[] getAnimals(){
        //returns an array of Animal objects
        Animal[] animals = {new Dog(), new Cat()};
        return animals;
    }
}

public class Main{
    public static void main(String[] args){
        AnimalShelter shelter = new AnimalShelter();

        Animal animal1 = shelter.adoptAnimal(); //returns an Animal object
        animal1.makeSound(); //Output: Woof!

        Animal[] animals = shelter.getAnimals(); //returns an array of Animal objects
        for (Animal animal : animals){
            animal.makeSound();
        }

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        shelter.feedAnimal(dog1); //takes an Animal object as an argument, but can also take Dog or Cat objects
        shelter.feedAnimal(cat1);
    }
}