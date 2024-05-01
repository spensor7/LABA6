import java.util.Scanner;

public class ComplexNumber {
    private double r;
    private double phi;

    public ComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть модуль комплексного числа:");
        this.r = scanner.nextDouble();
        System.out.println("Введіть аргумент комплексного числа:");
        this.phi = scanner.nextDouble();
    }

    public ComplexNumber(double r, double phi) {
        this.r = r;
        this.phi = phi;
    }

    public String toString() {
        return r + " * [cos(" + phi + ") + i * sin(" + phi + ")]";
    }

    public ComplexNumber power(int n) {
        double newR = Math.pow(r, n);
        double newPhi = phi * n;
        return new ComplexNumber(newR, newPhi);
    }
}
