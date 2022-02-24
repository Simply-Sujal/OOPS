public class A {
    private A(){

    }

    private static A instances;

    public static A getInstances(){
        // check whether 1 obj only is created or not 
        if (instances == null) {
            instances = new A();
        }
        return instances;
    }
}

public class Singelton{
    public static void main(String[] args) {
        A obj1 = A.getInstances();
        A obj2 = A.getInstances();
        A obj3 = A.getInstances();
        
        // all three 3 refernce variable are pointing to one object 
    }
}
