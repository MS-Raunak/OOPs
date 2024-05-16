package com.abstractkeyword.realworldexample;


abstract class Shape{
    String color;
    final static double pi;

    static {
        pi = 3.14;
    }
    abstract void calcArea();
    abstract void displayArea();

    Shape(String color){
        this.color = color;
    }
}

class Circle extends Shape{

    double radius;
    double area;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    void calcArea() {
        area = pi * Math.pow(radius, 2);
    }
    @Override
    void displayArea() {
        System.out.println("Color of" + this.getClass().getSimpleName() + ": " + color);
        System.out.println("Radius of" + this.getClass().getSimpleName() + ": " + radius);
        System.out.println("Area of" + this.getClass().getSimpleName() + ": " + area);
    }

}

class Rectangle extends Shape{

    double length;
    double breadth;
    double area;


    Rectangle(String color, double length, double breadth) {
        super(color);
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }

    @Override
    void displayArea() {
        System.out.println("Color of" + this.getClass().getSimpleName() + ": " + color);
        System.out.println("Length of " + this.getClass().getSimpleName() + ": " + length);
        System.out.println("Breadth of " + this.getClass().getSimpleName() + ": " + breadth);
        System.out.println("Area of " + this.getClass().getSimpleName() + ": " + area);
    }

}
public class AreaOfShape {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5);
        circle.calcArea();
        circle.displayArea();

        System.out.println("****************************");

        Rectangle rectangle = new Rectangle("blue", 5,6);
        rectangle.calcArea();
        rectangle.displayArea();

    }

}
