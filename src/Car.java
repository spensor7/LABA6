import java.util.Scanner;

abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public Car() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть модель:");
        this.model = scanner.nextLine();
        System.out.println("Введіть колір:");
        this.color = scanner.nextLine();
        System.out.println("Введіть максимальну швидкість:");
        this.maxSpeed = scanner.nextInt();
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Газуємо!");
    }
}

class Sedan extends Car {
    public Sedan() {
        super();
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

class Truck extends Car {
    public Truck() {
        super();
    }

    @Override
    public void brake() {
        System.out.println("Грузовик гальмує.");
    }
}
