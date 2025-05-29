package com.codewithmahdi;

import java.awt.*;

public class PassByValVsRef {
    public static void main(String[] args) {
        int x = 1;
        int val = incrementByOne(x); // a cope of the x value is passed(passed by value)
        System.out.println(x);
        System.out.println(val);

        Point point = new Point(100, 100);
        // before passing the reference to a method
        System.out.println(point);

        // after passing the reference and manipulating it
        changePoint(point); // a copy of the reference is passed(still passed by value, not by reference)
        System.out.println(point); // the original object is affected
    }

    private static void changePoint(Point point) {
        /*
          no longer modifies the original object in the main method
          because we are assigning a new object to the reference parameter
        */
        point = new Point(200, 200);
        point.x = 10;
        point.y = 10;
    }


    static int incrementByOne(int value) {
       return value + 1;
    }

}
