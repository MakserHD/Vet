public class Pet {
    protected String name;
    protected int age;
    protected double weight;
    protected boolean isHealthy;

    public Pet(String name, int age, double weight, boolean isHealthy) {
        this.name = name;
        this.setAge(age);
        this.weight = weight;
        this.isHealthy = isHealthy;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error: Age cannot be negative! Setting to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void makeSound() {
        System.out.println("...some animal noise...");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }
}