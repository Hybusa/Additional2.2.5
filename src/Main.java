import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Cat cat = new Cat("Holistic wet cat food","Home","Plush mouse");
        animals.add(cat);

        Dog dog = new Dog("Pedegree","Private home","Couch");
        animals.add(dog);

        Horse horse = new Horse("Hay","Stables","Trout");
        animals.add(horse);

        Vet vet = new Vet();

        animals.forEach(vet::treatAnimal);
    }
}