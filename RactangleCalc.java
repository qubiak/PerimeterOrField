package perimeterorfield;

import java.util.Scanner;

/**
 * @author qubiak
 */
class RactangleCalc {

    private double a, b;

    public void AB() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length 'a'");
        a = in.nextDouble();
        System.out.println("Enter the side length 'b'");
        b = in.nextDouble();
    }

    public double countArea() {
        this.AB();
        return a * b;

    }

    public double countPerimeter() {
        this.AB();
        return 2 * a + 2 * b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }
}
