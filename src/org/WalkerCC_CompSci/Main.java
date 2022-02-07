package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {
        org.WalkerCC_CompSci.Rectangle rectangle1 = new org.WalkerCC_CompSci.Rectangle(2, 4);
        org.WalkerCC_CompSci.Square square1 = new org.WalkerCC_CompSci.Square(3);

        System.out.println("The length of rectange1 is:  " + rectangle1.getLength());
        System.out.println("The width of rectange1 is:  " + rectangle1.getWidth());



        System.out.println("The Side Length of square1 is:  " + square1.getSideLength());



    }
}