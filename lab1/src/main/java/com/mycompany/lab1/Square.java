
package com.mycompany.lab1;


public class Square extends Shape{

      private double side_;
 
 public Square (double side, int color) {
 super (color);
 side_ = side;
 
 }
 
 public double getArea () {
 return side_ * side_; 
 }
 @Override
    public String toString() {
        return "Square{" + "side=" + side_ + '}';
    }
}
