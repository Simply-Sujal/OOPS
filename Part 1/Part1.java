
//classes are logical construct
//Objects are the physical reality which occupies space in memory 
// create a class
// for every single student
class Student {
    int roll;
    String name;
    float marks;

    // constructor
    // we need a way to add a value of the above properties object by object 
    // we need one word to access every object

    void greeting(){
        System.out.println("Hello welcome to my Kingdom" + this.name    );  
    }

    void changeName(String name){
        this.name = name;
    }
    // Student(){
    //     this.roll = 5;
    //     this.name = "Sujal Kumar Timilsina";
    //     this.marks = 90.87f;
    // }

    Student (Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student(){
        // this is how you call a  constructor from another constructor 
        // internally: new Student(67,"Raunak",78.4f);
        this(67,"Raunak",78.4f);
    }

    // Student Keta = new Student(18,"keta",67.5f);
    // here , this will be replaced with Keta
    Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class Part1{
    public static void main(String[] args) {
        
        //If you have to store the name of the 5 students then how do you store it :
        String[] name = new String[5];
        int[] roll = new int[5];
        float[] marks = new float[5];

        // Just declaring 
        // Student sujal;
        // sujal = new Student();

        Student sujal = new Student(42,"Ninja",78.32f);
        Student raj = new Student();

        // sujal.roll = 5;
        // sujal.name = "Sujal Kumar Timilsina";
        // sujal.marks = 90.87f;

        sujal.changeName("Varun Kumar");
        sujal.greeting();

        System.out.println(sujal.roll);
        System.out.println(sujal.name);
        System.out.println(sujal.marks);

        Student random1 = new Student();
        System.out.println(random1.name);

        Student one = new Student();
        Student two = one;

        one.name = "Piyush";
        System.out.println(two.name);
    }
}