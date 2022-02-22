
class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // when a member is declared static it can be accessed before any of the the object of the class is being created and without referenncing to that object
    //Static means we can use these things or we can use the main function without creating an object of that class
    static int population;

    static void message(){
        System.out.println("Heloo World");
        // System.out.println(this.age); // cant use this over here 
    }
    
    public Human(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
public class Exaxple {
        public static void main(String[] args) {
            Human Sujal = new Human(19, "Varun", 2000000, false);
            Human Carl = new Human(25, "Carl", 5600000, false);
            // System.out.println(Sujal.name);
            // System.out.println(Carl.age);

            System.out.println(Human.population);
            System.out.println(Human.population);
            System.out.println(Human.population);

            Exaxple funn = new Exaxple();
            funn.fun2();
        }

    // this is not dependent on object 
    static void fun(){
    // greeting(); //you can use this because it requries an instance 
    // but the function you are using it in does not depend on instances 

    //we cannot access non static stuff without referencing their instance in 
    // a static context
    // here i am referencing it 
    Exaxple obj = new Exaxple();
    obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // we know somthing which is not static , belong to the object 
    void greeting(){
        //fun();
        System.out.println("Hello World");
    }
}
