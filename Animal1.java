public class Animal1{
    public void makeSound(){
        System.out.println("Animal is making a sound.")
    }
}

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog is barking");
    }
}

public void fetch(){
    System.out.println("Dog is fetching.");
}

public class Main{
    public static void main(String[] args){
        Animal myDog = new Dog();

        myDog.makeSound(); //prints "Dog is barking"
        //myDog.fetch(); //This wouldn't compile because fetch() isn't defined in the Animal class
    }
}