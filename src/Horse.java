public class Horse extends Animal{

    String preferableTypeOfRunning;
    Horse(){}
    Horse(String food, String location){}

    Horse(String food, String location, String preferableTypeOfRunning){
        super(food,location);
        this.preferableTypeOfRunning = preferableTypeOfRunning;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Horse go brrrr");
    }

    @Override
    public void eat() {
        System.out.println("Horse eating");
    }
}
