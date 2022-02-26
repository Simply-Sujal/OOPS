package Part4.AbstractClass;

public abstract class Parent{

    // In abstract class we can create an object of an abstract class , we cannot create an static constructor , abstract constructor in this , abstract static method in this 

    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();

}