
package com.mycompany.lab1;


public class Rectangle extends Shape{

   private double length_, width_;
 
 public Rectangle (double length, double width, int color) {
 super (color);
 length_ = length; 
 width_ = width;
 }
 
 public double getArea () {
 return length_ * width_; 
 }
 @Override
    public String toString() {
        return "Rectangle{" + "length=" + length_ + ", width=" + width_ +'}';
    }
}

