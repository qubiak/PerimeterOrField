package perimeterorfield;

import java.util.Scanner;

/**
 *
 * @author qubiak
 */
class TriangleCalc {

    private double a, b, c, h;
    Scanner in = new Scanner(System.in);

    public double countAreaH() {
        this.AH();
        return (a * h) / 2;
    }

    public double countArea() {

        Choices.WithoutH();
        this.ABC();
        //czepialeś się wcześniej this.ABC(); że przez to liczy dwa razy, ale bez tego nie liczy w ogóle bo nie pobiera tych danych
        if (a + b > c && a + c > b && b + c > a) {
            return ((Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * ((-a) + b + c))) / 4);

        }
        return 0;
        //jak nie robię tego return to mi pokazuję błąd
    }

    public void AH() {
        System.out.println("Enter the side length 'a'");
        a = in.nextDouble();
        System.out.println("Enter the side length 'h'");
        h = in.nextDouble();
    }

    public double countPerimeter() {
        this.ABC();
        if (a + b > c && a + c > b && b + c > a) {
            return (a + b + c);
        }
        return 0;
    }

    public void ABC() {
        System.out.println("Enter the side length 'a'");
        a = in.nextDouble();
        System.out.println("Enter the side length 'b'");
        b = in.nextDouble();
        System.out.println("Enter the side length 'c'");
        c = in.nextDouble();
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getH() {
        return this.h;
    }
}
