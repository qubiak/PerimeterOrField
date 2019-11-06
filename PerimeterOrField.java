package perimeterorfield;

import java.util.Scanner;

/**
 * @author qubiak
 *
 * The program calculates the area and perimeter of selected geometric figures.
 */
public class PerimeterOrField {

    public static void main(String[] args) {

        int x; // character describing figure
        int counter = 0;

        String[] result = new String[10];
        Scanner in = new Scanner(System.in);

        while (true) {

            Choices.SelectFigure();

            x = in.nextInt();

            switch (x) {

                case 1: {
                    Choices.WhatCalculate();
                    x = in.nextInt();

                    switch (x) {

                        case 1: {

                            RactangleCalc countPerimeter = new RactangleCalc();
                            double perimeter = countPerimeter.countPerimeter();
                            System.out.println("Perimeter of ractangle is: " + perimeter);
                            result[counter] = "Perimeter of ractangle witch a = " + countPerimeter.getA() + ", b = " + countPerimeter.getB() + " is: " + perimeter;
                            counter++;
                            break;
                        }
                        case 2: {

                            RactangleCalc countArea = new RactangleCalc();
                            double area = countArea.countArea();
                            System.out.println("Area of ractangle is: " + area);
                            result[counter] = "Area of ractangle with a = " + countArea.getA() + ", b =  " + countArea.getB() + " is: " + area;
                            counter++;

                            break;
                        }
                        default: {
                            Choices.OutOfRange();
                        }

                    }
                    break;
                }

                case 2: {
                    Choices.WhatCalculate();
                    x = in.nextInt();

                    switch (x) {

                        case 1: {
                            CircleCalc countPerimeter = new CircleCalc();
                            double perimeter = countPerimeter.countPerimeter();
                            System.out.println("Perimeter of Circle is: " + perimeter);
                            result[counter] = "Perimeter of circle with r = " + countPerimeter.getR() + " is: " + perimeter;
                            counter++;
                            break;
                        }

                        case 2: {
                            CircleCalc countArea = new CircleCalc();
                            double area = countArea.countArea();
                            System.out.println("Area of circle is: " + area);
                            result[counter] = "Area of circle with r = " + countArea.getR() + " is: " + area;
                            counter++;
                            break;
                        }
                        default: {
                            Choices.OutOfRange();
                        }
                    }
                    break;
                }

                case 3: {
                    Choices.WhatCalculate();
                    x = in.nextInt();

                    switch (x) {

                        case 1: {
                            TriangleCalc countPerimeter = new TriangleCalc();
                            double perimeter = countPerimeter.countPerimeter();
                            System.out.println("Perimeter of triangle is: " + perimeter);
                            result[counter] = "Perimeter of triangle with a = " + countPerimeter.getA() + " and b = " + countPerimeter.getB() + " and c = " + countPerimeter.getC() + " is: " + perimeter;
                            counter++;
                            break;

                        }

                        case 2: {
                            System.out.println("You know the height in the triangle?");
                            System.out.println("Yes - press '1'");
                            System.out.println("No - press '2'");

                            x = in.nextInt();

                            switch (x) {

                                case 1: {
                                    TriangleCalc countAreaH = new TriangleCalc();
                                    double areaH = countAreaH.countAreaH();
                                    System.out.println("Area of Triangle is: " + areaH);
                                    result[counter] = "Area of Triangle with a = " + countAreaH.getA() + " and h = " + countAreaH.getH() + " is: " + areaH;
                                    counter++;
                                    break;
                                }

                                case 2: {
                                    TriangleCalc countArea = new TriangleCalc();
                                    double area = countArea.countArea();
                                    System.out.println("Area of Triangle is: " + area);
                                    result[counter] = "Area of Triangle witch a = " + countArea.getA() + " b = " + countArea.getB() + " c = " + countArea.getC() + " is: " + area;
                                    counter++;
                                    break;
                                }

                                default: {
                                    Choices.OutOfRange();
                                }

                            }
                            break;

                        }

                        default: {
                            Choices.OutOfRange();
                        }

                    }
                    break;
                }

                case 4: {

                    for (int i = 0; i < result.length; i++) {
                        if (result[i] != null) {
                            System.out.println(result[i]);
                        }
                    }
                    break;
                }

                case 0: {
                    System.exit(0);
                }
                default: {
                    Choices.OutOfRange();
                }
            }

        }
    }

}
