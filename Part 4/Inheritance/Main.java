package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // Box box1 = new Box(10);
        // Box box2 = new Box(67,89,23);
        // Box box3 = new Box(box1);
        
        // System.out.println(box.l + " " + box.h + " " + box.w);
        // System.out.println(box1.l + " " + box1.h + " " + box1.w);
        // System.out.println(box2.l + " " + box2.h + " " + box2.w);
        // System.out.println(box3.l + " " + box3.h + " " + box3.w);

        // Boxweight box4 = new Boxweight();
        // Boxweight box5 = new Boxweight(3,6,7,9);
        // System.out.println(box4.h + " " + box5.weight);

        // Box box6 = new Boxweight(2,4,6,10);
        // System.out.println(box6.w);

        // there are many variables in both parent and child classes
        // you are given access to variable that are in the reference type i.e. Boxweight
        // hence , you should have access to weight variable
        // this also means , that the ones you are trying to access should be initialised 
        // but here , when the object itself is of type parent class, how will you call the constructor of the child class 
        // this is why error 
        // so you cannot have child reference variable and a parent object , we cant do that 

        // Boxweight box7 = new Box(6,34,6);
        // System.out.println(box7);  


        // Boxprice box = new Boxprice();
    }
}
