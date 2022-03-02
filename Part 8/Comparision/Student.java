package Part7.Comparision;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll , float marks){
        this.roll = roll;
        this.marks = marks;
    }

    public int compareTo(Student o){
        int diff = (int) (this.marks - o.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }
}
