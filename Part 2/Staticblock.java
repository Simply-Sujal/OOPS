
// this is a demo to show initialisation of static varible
public class Staticblock {
    static int a = 10;
    static int b;

    // will only run once , when the first object is create i.e when the class is loaded for the first time 
    static{
        System.out.println("Hello welcome you all");
        b = a * 5;

    }
    
    public static void main(String[] args) {
        Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a + " " + Staticblock.b);

        Staticblock.b += 5;

        Staticblock obj2 = new Staticblock();
        System.out.println(Staticblock.a + " " + Staticblock.b);
    } 
}
