public interface Pet{
    void beFriendly();
    void play();
}

public class Dog extends Canine implements Pet{
    public void beFriendly(){};
    public void play(){};

    public void roam(){};
    public void eat(){}; //curly braces to override the abstract methods in the Pet interface

}