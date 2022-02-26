package Part4.AbstractClass;

public class Main {
    public static void main(String[] args) {
        
        Son son = new Son(19);
        son.career();
        
        son.normal();

        Parent daughter = new Daughter(25);
        daughter.career();

        Parent.hello();
        // Parent parent = new Parent(); we cant create an object of an abstract class 
    }
}
