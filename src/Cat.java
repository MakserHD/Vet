public class Cat extends Pet {
    private int miceCaught;

    public Cat(String name, int age, double weight, boolean isHealthy, int miceCaught) {
        super(name, age, weight, isHealthy);
        this.miceCaught = miceCaught;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + " says: Meow...");
    }

    @Override
    public String toString() {
        return "[Cat] " + super.toString() + ", Mice: " + miceCaught;
    }
}