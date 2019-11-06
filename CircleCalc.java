package perimeterorfield;

import java.util.Scanner;

/**
 *
 * @author qubiak
 */
class CircleCalc {

    final double pi = 3.14;
    private double r;

    public void R() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle 'r'");
        r = in.nextDouble();
    }
    
    public double countArea(){
        this.R();
        return pi * (r * r);
    }
    
    public double countPerimeter(){
        this.R();
        return 2 * pi * r;
    }
    
    public double getR(){
        return this.r;
    }
}
