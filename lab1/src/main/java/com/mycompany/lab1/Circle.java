
package com.mycompany.lab1;


public class Circle  extends Shape {

    private double radius_;
 protected static double PI = 3.14;

    public Circle(double radius, int color) {
        super(color);
        radius_ = radius;
    }
 

 
 public double getArea () {
 return PI * radius_ * radius_;
 }
 @Override
    public String toString() {
        return "Circle{" + "radius=" + radius_ + '}';
    }
} 

