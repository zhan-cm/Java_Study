package Test1;

import java.util.Arrays;

public class MyArrayList <E>{
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
