public class Exceptionhandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;

        try{
            divides(a, b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always be executed");
        }
    }

    static int divides(int a , int b) throws ArithmeticException{
        if (b == 0) {
            System.out.println("Do not divide by zero");
        }
        return a / b;
    }
}
