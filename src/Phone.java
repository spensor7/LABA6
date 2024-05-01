import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер телефону:");
        this.number = scanner.nextLine();
        System.out.println("Введіть назву та модель телефону:");
        this.model = scanner.nextLine();
        System.out.println("Введіть приблизну вагу телефону:");
        this.weight = scanner.nextDouble();
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Відправлені повідомлення на наступні номери:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
