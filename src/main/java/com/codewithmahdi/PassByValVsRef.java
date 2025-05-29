package com.codewithmahdi;

public class PassByValVsRef {
    public static void main(String[] args) {
        int x = 1;
        incrementByOne(x);
        System.out.println(x);
    }

    static void incrementByOne(int value) {
        value++;
    }

}
