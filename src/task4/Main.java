package task4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(11);

        Iterator<Integer>iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer+1);
        }



    }
}
