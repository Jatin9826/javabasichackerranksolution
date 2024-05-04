//hacker rank java certification problem solution 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Shape {
    public int length , breadth ;
    public Shape( int length , int breadth ) {
        this.length = length ;
        this.breadth = breadth ;
    }
    public void area() {
        System.out.print(length + " " + breadth);
    }
}

class Rectangle extends Shape {
    Rectangle(int l , int b) {
        super(l,b);
    }
    @Override
    public void area() {
        System.out.print("\n" + length*breadth);
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l,b);
        shape.area();

        Shape rectangle = new Rectangle(l,b);
        rectangle.area();
    }
}