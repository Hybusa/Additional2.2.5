public class Animal {
    String food;
    String location;

    Animal(){}

    Animal(String food, String location)
    {
        this.food = food;
        this.location = location;
    }

    public void makeSound() {
        System.out.println("Animal sounds");
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }
}
