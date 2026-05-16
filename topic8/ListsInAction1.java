package topic8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListsInAction1 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(3);
        numberList.add(5);
        numberList.add(7);
        numberList.set(1, 10);

        // numberList.remove(Integer.valueOf(3));

        System.out.println(numberList.toString());
        // for(var el : numberList){
        // System.out.println(el);
        // }
        // for (int i = 0; i < numberList.size(); i++) {
        // System.out.println(numberList.get(i));
        // }

        // Iterator it = numberList.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // ListIterator listIt = numberList.listIterator(numberList.size());
        // while (listIt.hasPrevious()) {
        //     System.out.println(listIt.previous());
        // }

    }
}
