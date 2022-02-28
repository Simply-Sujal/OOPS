package Polymorphism;

public class Circle extends Shapes{


    // this will run when obj of circle is created 
    //hence it is overiding the parent class 
    @Override // this is called annotation
    void area(){
        System.out.println("The area is pi * r * r");
    }
}
