import javax.security.auth.SubjectDomainCombiner;

public class Wrapperexample {
    public static void main(String[] args) {
        // Remember in Java there is no such thing called pass by reference but in java there is something called passs by value .
        // but when you passs an object , here the reference value is passed .
        // int a = 90;
        // int b = 67;

        // Integer num = 50;

        Integer a = 90;
        Integer b = 67;
        swap(a, b);
        System.out.println(a + " " + b);

        // final int bonus = 2; // final keyword is use to make things final or const thatmeans we are saying we cant change it 
        // bonus = 5; // i wont change the value of bonus coz its final 

        final A Sujal = new A("Sujal Kumar Timilsina");
        Sujal.name = "Programmer"; // we can change the value but we cant reassign it 

        //When a non primitive is final , you cannot reassign it 
        // Sujal = new A("Coder"); 

        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(int a , int b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A{
    final int num = 15;
    String name;

    A(String name){
        // System.err.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
