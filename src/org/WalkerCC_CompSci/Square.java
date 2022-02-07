package org.WalkerCC_CompSci;

public final class Square extends org.WalkerCC_CompSci.Rectangle {

    public Square(double sideLength) {
        super(sideLength , sideLength);//what goes here

    }

    public double getSideLength(){
        return this.length;

    }

    public void setSideLength(double width){
         this.length = width;
         this.width = width;

    }


}