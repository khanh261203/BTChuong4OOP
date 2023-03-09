/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shape;

/**
 *
 * @author ADMIN
 */
public class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return this.filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "A Shape with color of " + this.color + " and " + (this.filled ? "filled" : "not filled");
    }
}

public class Circle extends Shape {
    protected double radius;
    private final double PI = 3.14;
    
    public Circle() {
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return this.PI * this.radius * this.radius;
    }
    
    public double getPerimeter() {
        return 2 * this.PI * this.radius;
    }
    
    public String toString() {
        return " radius= " + this.radius + "  " + super.toString();
    }
}

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return this.width * this.length;
    }
    
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    
    public String toString() {
        return "HCN chieu rong=" + this.width + " va chieu dai=" + this.length + "  " + super.toString();
    }
}
public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public String toString() {
        return "Square[width=" + super.getWidth() + ",length=" + super.getLength() + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
publuc class Main{
        public static void main(String[] args) {
         Shape shape1 = new Circle(2.0, "blue", true);
         Shape shape2 = new Rectangle(2.0, 4.0, "green", false);
         Shape shape3 = new Square(3.0, "red", true);
    
    System.out.println(shape1.toString());
    System.out.println(shape2.toString());
    System.out.println(shape3.toString());
}
}
