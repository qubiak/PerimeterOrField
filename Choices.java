package perimeterorfield;

/**
 *
 * @author qubiak
 */
public class Choices {

    static void SelectFigure() {

        System.out.println(" \n"
                + "Let me know. Our calculations will concern: \n"
                + "Rectangle - press '1' \n"
                + "Circle - press '2' \n"
                + "Triangle - press '3' \n"
                + " \n"
                + "See result - press '4' \n"
                + "Close a program - press '0' \n");

    }

    static void WhatCalculate() {

        System.out.println("You want to calculate perimeter or filed? \n"
                + "Perimeter - press '1' \n"
                + "Filed - press '2' \n");

    }

    static void OutOfRange() {

        System.out.println("You selected a number out of range, try again.");

    }

    static void WithoutH() {

        System.out.println("If you don't know the height of the triangle, enter the length of all sides");
    }
}
