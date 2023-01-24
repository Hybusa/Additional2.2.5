public class Cat extends Animal{
    String favoriteToy;

    Cat(){}
    Cat(String food, String location){}

    Cat(String food, String location, String favoriteToy)
    {
        super(food,location);
        this.favoriteToy = favoriteToy;
    }



    @Override
    public void makeSound()
    {
        System.out.println("Cat meows");
    }
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }
}
