package ch03.numevens;

import java.util.Random;

public class NumberEvens {
    public static final int MAX_LIST_SIZE = 10;
    public static final Random myRandom = new Random();

    public static int numEvens(LLNode<Integer> list) {
        //Add code here to complete Exercise 16, page 209
        LLNode<Integer> temp = list;
        int listsize = 0;
        while(temp != null)
        {
            if(temp.getInfo() % 2 ==0)
            listsize++;
            temp = temp.getLink();


        }
        return listsize;
    }

    public static LLNode<Integer> createList() {
        LLNode<Integer> newList = new LLNode<>(myRandom.nextInt(100));
        LLNode<Integer> listHead = newList;
        LLNode<Integer> nextNode;
        for(int loopCounter = 0; loopCounter < MAX_LIST_SIZE; loopCounter++) {
            nextNode = new LLNode<>(myRandom.nextInt(100));
            newList.setLink(nextNode);
            newList = newList.getLink();
        }
        return listHead;
    }

    public static void iterPrintList(LLNode<Integer> listRef)
    // Prints the contents of the listRef linked list to standard output
    {
        while (listRef != null)
        {
            System.out.print(listRef.getInfo() + "\t");
            listRef = listRef.getLink();
        }
    }

    public static void main(String[] args) {
	    LLNode<Integer> testList = createList();
	    System.out.println("Here is the randomly generated test list:");
        iterPrintList(testList);
        System.out.println("\nThe number of even numbers on the list is: " + numEvens(testList));
    }
}
