
// this is a demo to show initialisation of static varible
public class Staticblock {
    static int a = 10;
    static int b;

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
