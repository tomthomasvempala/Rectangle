package com.thoughtworks.rectangle;

public class Rectangle {
    private final int breadth;
    private final int length;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return length*breadth;
    }
    
}
