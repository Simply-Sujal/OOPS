
public class Innerclasses {

    static class A{
        String name;
        public A(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        A a = new A("Sumjal");
        A b = new A("Varun");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
