public class Vet {
    public void treatAnimal(Animal animal)
    {
        System.out.println("Animal food type is: " + animal.food + ", animal location is " + animal.location);
        animal.makeSound();
    }
}
