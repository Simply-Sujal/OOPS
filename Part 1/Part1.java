
// create a class
class Student {
    int roll;
    String name;
    float marks;
}

public class Part1{
    public static void main(String[] args) {
        
        //If you have to store the name of the 5 students then how do you store it :
        String[] name = new String[5];
        int[] roll = new int[5];
        float[] marks = new float[5];

        // 
        Student sujal = new Student();
        sujal.roll = 5;
        System.out.print(sujal.roll);
    }
}