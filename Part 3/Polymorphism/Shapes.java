package Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in Shapes");
    }

    // Early bindings : 
    final void area(){ // we cannot override a method i.e. final.
        System.out.println("I am in Shapes");
    }
}
