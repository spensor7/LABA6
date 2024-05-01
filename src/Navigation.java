import java.util.Scanner;

public class Navigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Оберіть завдання:");
            System.out.println("1. Person");
            System.out.println("2. Phone");
            System.out.println("3. Car");
            System.out.println("4. ComplexNumber");
            System.out.println("5. Вийти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performPersonTask();
                    break;
                case 2:
                    performPhoneTask();
                    break;
                case 3:
                    performCarTask();
                    break;
                case 4:
                    performComplexNumberTask();
                    break;
                case 5:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 5);
    }

    private static void performPersonTask() {
        Person person1 = new Person();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть повне ім'я для другої особи:");
        String fullName = scanner.nextLine();
        System.out.println("Введіть вік для другої особи:");
        int age = scanner.nextInt();
        Person person2 = new Person(fullName, age);
        System.out.println("Оберіть дію:");
        System.out.println("1. Говорити");
        System.out.println("2. Рухатись");
        int actionChoice = scanner.nextInt();

        if (actionChoice == 1) {
            person1.talk();
            person2.talk();
        } else if (actionChoice == 2) {
            person1.move();
            person2.move();
        } else {
            System.out.println("Неправильний вибір.");
        }
    }

    private static void performPhoneTask() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.receiveCall("John");
        System.out.println("Номер телефону: " + phone1.getNumber());

        phone2.receiveCall("Anna");
        System.out.println("Номер телефону: " + phone2.getNumber());

        phone3.receiveCall("Tom");
        System.out.println("Номер телефону: " + phone3.getNumber());

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }

    private static void performCarTask() {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }

    private static void performComplexNumberTask() {
        ComplexNumber complexNumber = new ComplexNumber();
        System.out.println("Введіть ступінь, до якого піднести комплексне число:");
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        ComplexNumber result = complexNumber.power(power);
        System.out.println("Результат піднесення комплексного числа до степеня " + power + ": " + result);
    }
}

