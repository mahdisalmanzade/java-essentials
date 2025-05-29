package com.codewithmahdi;

public class PassByValVsRef {
    public static void main(String[] args) {
        int x = 1;
        int val = incrementByOne(x);
        System.out.println(x);
        System.out.println(val);
    }

    static int incrementByOne(int value) {
       return value + 1;
    }

}
