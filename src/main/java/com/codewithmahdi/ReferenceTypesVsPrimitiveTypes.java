package com.codewithmahdi;

public class ReferenceTypesVsPrimitiveTypes {

    public void display() {
        // Cope by value
        int a = 10;
        int b = a;

        a = 100;
        System.out.println("a: " + a + " b: " + b);


        // Copy by reference
        Person alex = new Person("Alex"); // a reference to Alex object is stored in the alex reference variable
        Person mariam = alex; // coping the reference from alex to mariam

        System.out.println("before changing Alex");
        System.out.println(alex.name + " " + mariam.name); // both referring to the same object


        /*
        changing mariam name causes alex to change
        because both are storing the reference to the same object in the memory
         */
        mariam.name = "Edward";

        System.out.println("after changing Alex");
        System.out.println(alex.name + " " + mariam.name); // both referring to the same object
    }

    public class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
