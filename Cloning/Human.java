import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age , String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{5,4,8,2,3};
    }

    // public Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        return super.clone();
    }

    
public static void main(String[] args) throws CloneNotSupportedException{
    Human sujal = new Human(15,"Sujal Kumar Timilsina");
    // Human twin = new Human(sujal);

    Human twin = (Human)sujal.clone();
    System.out.println(twin.age + " " + twin.name);
    System.out.println(Arrays.toString(twin.arr));

    twin.arr[0] = 100;

    System.out.println(Arrays.toString(sujal.arr));
}
}


