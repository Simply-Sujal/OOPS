package Part4.AbstractClass;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void normal(){
        super.normal();
    }
    
    
    @Override
    void career(){
        System.out.println("I want to become a Programmer");
    }

    @Override
    void partner(){
        System.out.println("She loves SuperMan");
    }

}
