package Part4.AbstractClass;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void normal(){
        super.normal();
    }
    
    @Override
    void career(){
        System.out.println("I want to become a Doctor");
    }

    @Override
    void partner(){
        System.out.println("He loves Scarlett Jhonson");
    }

}
