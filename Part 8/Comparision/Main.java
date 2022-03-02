package Part7.Comparision;

public class Main {
    public static void main(String[] args) {
        Student sujal = new Student(2, 92.3f);
        Student varun = new Student(10, 99.23f);

        if (sujal.compareTo(varun) < 0) {
            System.out.print(sujal.compareTo(varun));
            System.out.println("Sujal has more marks");
        }
    }

}
