public class Exceptionhandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;

        try{
            int c = a / b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will always be executed");
        }
    }
}
