package ch06.apps;

import ch06.lists.ABList;

public class TestIndexed {
    public static void main(String[] args) {
        // write your code here
        //Page 412 Exercise 8C
        ABList<String> myABList1 = new ABList();
        System.out.println("The list is empty: " + myABList1.isEmpty());
        System.out.println("Add some entries to the list: ");

        myABList1.add("Apple");
        myABList1.add("Peach");
        myABList1.add("Orange");
        myABList1.add("Grape");
        myABList1.add("Pear");
        System.out.println("The list is empty: " + myABList1.isEmpty());
        System.out.println("The list is full: " + myABList1.isFull());
        System.out.println("Now Testing Size of list: " + myABList1.size());
        System.out.print("Here is the list: ");
        System.out.println(myABList1.toString());
        System.out.println("Testing IndexOf: ");
        System.out.println("Finding IndexOf with \"Apple\": " + myABList1.indexOf("Apple"));
        System.out.println("Finding IndexOf with \"Berry\": " + myABList1.indexOf("Berry"));
        System.out.println("Testing Set method: ");
        myABList1.set(0, "Watermelon");
        System.out.print("The List Now: ");
        System.out.println(myABList1.toString());
    }
}
