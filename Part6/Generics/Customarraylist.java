package Part6.Generics;

import java.util.ArrayList;

public class Customarraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as a index value

    public Customarraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copying the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        Customarraylist list = new Customarraylist();
        list.add(3);
        list.add(12);
        list.add(90);
        list.add(20);
        list.add(234);

        System.err.println(list);

        // list.add(67);
        // list.add(100);
        // list.remove(0);
        // list.get(0);
        // list.set(1, 999);
        // list.isEmpty();
        // list.size();
    }
}
