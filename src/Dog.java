public class Dog extends Animal{

    String whatToChewOn;
    Dog(){}
    Dog(String food, String location){}

    Dog(String food, String location, String whatToChewOn){
        super(food, location);
        this.whatToChewOn = whatToChewOn;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
