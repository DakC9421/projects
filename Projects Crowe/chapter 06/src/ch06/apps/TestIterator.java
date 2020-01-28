package ch06.apps;

import ch06.lists.ABList;

import java.util.Iterator;


public class TestIterator {
    public static void main(String[] args) {
        // write your code here
        //Page 412 Exercise 8D
        ABList<String> myABList1 = new ABList();

        myABList1.add("Apple");
        myABList1.add("Peach");
        myABList1.add("Orange");
        myABList1.add("Grape");
        myABList1.add("Pear");

        Iterator<String> myIter = myABList1.iterator();
        while(myIter.hasNext()){
            System.out.println(myIter.next());
            myIter.remove();
        }

    }
}
