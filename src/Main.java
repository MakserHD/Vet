private static final ArrayList<Pet> myPets = new ArrayList<>();
private static final Scanner scan = new Scanner(System.in);

void main() {
    myPets.add(new Dog("Rex", 5, 12.5, true, "Husky"));
    myPets.add(new Cat("Luna", 2, 3.0, true, 5));

    boolean running = true;

    while (running) {
        IO.println("\n=== VET CLINIC MENU ===");
        IO.println("1. Add a Dog");
        IO.println("2. Add a Cat");
        IO.println("3. View All Pets");
        IO.println("4. Listen to Pets (Polymorphism)");
        IO.println("0. Exit");
        IO.print("Choice: ");

        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            addDog();
        } else if (choice == 2) {
            addCat();
        } else if (choice == 3) {
            viewAll();
        } else if (choice == 4) {
            demoSounds();
        } else if (choice == 0) {
            running = false;
            IO.println("Goodbye!");
        } else {
            IO.println("Wrong choice, try again.");
        }
    }
}

public static void addDog() {
    IO.print("Enter Name: ");
    String name = scan.nextLine();

    IO.print("Enter Age: ");
    int age = scan.nextInt();
    scan.nextLine();

    IO.print("Enter Breed: ");
    String breed = scan.nextLine();

    Dog d = new Dog(name, age, 10.0, true, breed);
    myPets.add(d);
    IO.println("Dog added successfully!");
}

public static void addCat() {
    IO.print("Enter Name: ");
    String name = scan.nextLine();

    IO.print("Enter Age: ");
    int age = scan.nextInt();
    scan.nextLine();

    Cat c = new Cat(name, age, 4.0, true, 0);
    myPets.add(c);
    IO.println("Cat added successfully!");
}

public static void viewAll() {
    IO.println("\n--- LIST OF PETS ---");

    for (Pet p : myPets) {
        IO.println(p.toString());

        if (p instanceof Dog tempDog) {
            tempDog.run();
        } else if (p instanceof Cat) {
            IO.println("-> This is a cat.");
        }
    }
}

public static void demoSounds() {
    IO.println("\n--- NOISES ---");
    for (Pet p : myPets) {
        p.makeSound();
    }
}