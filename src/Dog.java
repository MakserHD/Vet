public class Dog extends Pet {
    private final String breed;

    public Dog(String name, int age, double weight, boolean isHealthy, String breed) {
        super(name, age, weight, isHealthy);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " says: WOOF!");
    }

    public void run() {
        System.out.println(name + " is running fast!");
    }

    @Override
    public String toString() {
        return "[Dog] " + super.toString() + ", Breed: " + breed;
    }
}