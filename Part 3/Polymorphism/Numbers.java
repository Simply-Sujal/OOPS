package Polymorphism;

public class Numbers {
    
    int sum(int a , int b){
        return a + b;
    }

    int sum(int a ,int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(5,5);  // this is compile time polymorphism
        num.sum(5,5,10); // this is compile time polmorphism

        // num.sum(10,10,20,60);
    }
}
