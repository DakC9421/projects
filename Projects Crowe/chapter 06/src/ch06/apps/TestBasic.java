package ch06.apps;

import ch06.lists.ABList;

public class TestBasic {

    public static void main(String[] args) {
        ABList<String> myABList1 = new ABList();
        System.out.println("Add some entries to the list: ");

        myABList1.add("Apple");
        myABList1.add("Peach");
        myABList1.add("Orange");
        myABList1.add("Grape");
        myABList1.add("Pear");
        System.out.println("Now Testing Size of list: " + myABList1.size());
        System.out.print("Here is the list: ");
        System.out.println(myABList1.toString());
        System.out.println("removing item list: ");
        myABList1.remove("Apple");
        System.out.print("List Now: ");
        System.out.println(myABList1.toString());
        System.out.println("Removing by Int: ");
        myABList1.remove(1);
        System.out.println("The Array Now: ");
        System.out.println(myABList1.toString());
        System.out.println("This list contains \"Grape\": ");
        System.out.println("This list contains \"Apple\": ");
        System.out.println("Now testing Get method: ");
        System.out.println("Getting \"Grape\": " + myABList1.get("Grape"));
        System.out.println("Getting \"Apple\": " + myABList1.get("Apple"));
        System.out.println("Now Testing Size of list: " + myABList1.size());



	// write your code here
        //Page 412 Exercise 8b
    }
}
