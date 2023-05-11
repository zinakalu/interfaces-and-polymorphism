class SomeClass{
    public Object getObject (Object obj){
        //some implementation
        return obj
    }
}

class Animal{
    //Some Animal-specific code
}

class Dog extends Animal{
    //Some Dog-specific code
}

public class MyClass{
    public static void main(String[] args){
        SomeClass x = new SomeClass();
        Animal aDog = new Dog();

        Dog d = (Dog) x.getObject(aDog);
    }
}