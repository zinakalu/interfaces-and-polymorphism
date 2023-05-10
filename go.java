public void go(){
    Dog aDog = new Dog();
    Dog sameDog = getObject(aDog);
}
public Object getObject(Object o){
    return o;
}


public void go(){
    Dog aDog = new Dog();
    Object sameDog = getObject(aDog);

}
public Object getObject(Object o){
    return o;
}