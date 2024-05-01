import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть повне ім'я:");
        fullName = scanner.nextLine();
        System.out.println("Введіть вік:");
        age = scanner.nextInt();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }

    public void performAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть дію:");
        System.out.println("1. Рухатись");
        System.out.println("2. Говорити");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                move();
                break;
            case 2:
                talk();
                break;
            default:
                System.out.println("Невірний вибір.");
        }
    }
}
