package Part6.Generics;

import java.util.ArrayList;

class MyGenerics<T>{
    int val;
    private T t;

    public MyGenerics(int val , T t){
        this.val = val;
        this.t = t;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

}

public class Generics {
    public static void main(String[] args) {
        // ArrayList <Integer> arrayList = new ArrayList<>();
        // // ArrayList <int> arrayList = new ArrayList<>(); --> this will throw an error 

        // // arrayList.add("Sujal");
        // arrayList.add(67);
        // arrayList.add(2);
        // arrayList.add(99);

        // int a = arrayList.get(2);
        // System.out.println(a);

        MyGenerics<String> s1 = new MyGenerics(100, "Sujal");
        String str = s1.getT();

        System.out.println(str);
    }
}
