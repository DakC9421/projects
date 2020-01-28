package ch02.llnode;

import java.util.*;

public class LLNodeApplication {
    private static LLNode<Integer> numbers;
    public final static int LIST_SIZE = 5;
    public final static int MAX_INT_SIZE = 100;

    private static void createList()
    {
        Random nextNumber = new Random();
        numbers = new LLNode<>(nextNumber.nextInt(MAX_INT_SIZE));
        LLNode<Integer> currNode = numbers;
        LLNode<Integer> newNode;
        for(int insertionCounter = 0; insertionCounter < LIST_SIZE; insertionCounter++) {
            newNode = new LLNode<>(nextNumber.nextInt(MAX_INT_SIZE));
            currNode.setLink(newNode);
            currNode = currNode.getLink();
        }//End for loop

    }//End createList()

    public static void main(String[] args) throws EmptyList {
	    createList();

	    methodA();
	    methodB();
	    methodC();
	    methodD();
	    methodE();

    }//End main()

    private static void methodA() throws EmptyList {
        //Complete Page 156-157 Exercise 41 A here
        LLNode<Integer> temp = numbers;
        int sumNum = 0;
        if(temp == null)
        {
            throw new EmptyList("Empty List");
        }
        else {
            while (temp != null) {
                sumNum += temp.getInfo();
                temp = temp.getLink();
            }
        }
        System.out.println("Method A");
     System.out.println("Sum Numbers " + sumNum);
    }//End methodA

    private static void methodB() throws EmptyList {
        //Complete Page 156-157 Exercise 41 B here
        LLNode<Integer> temp = numbers;
        int eleTemp = 0;
        if(temp == null)
        {
            throw new EmptyList("no elements");
        }
        else{
            while(temp != null)
            {
                eleTemp++;
                temp = temp.getLink();
            }
        }
        System.out.println("Method B");
        System.out.println("Elements are " + eleTemp);


    }//End methodB

    private static void methodC() throws EmptyList {
        //Complete Page 156-157 Exercise 41 C here
        LLNode<Integer> temp = numbers;
        int posList = 0;
        if(temp == null)
        {
            throw new EmptyList("No Positive numbers");
        }
        else{
            while(temp != null)
            {
                if(temp.getInfo() > 0)
                {
                    posList++;
                    temp = temp.getLink();
                }
            }
        }
        System.out.println("Method C");
        System.out.println("Even Numbers " + posList);

    }//End methodC

    private static void methodD() throws EmptyList {
        //Complete Page 156-157 Exercise 41 D here
        LLNode<Integer> temp = numbers;
        int contentList = 1;
        if(temp == null)
        {
            throw new EmptyList("No contained Numbers");
        }
        else{
            while(temp != null)
            {

                System.out.println(contentList + ".\t" + temp.getInfo());
                temp = temp.getLink();
                contentList++;
            }
        }

    }//End methodD

    private static void methodE() throws EmptyList {
        //Complete Page 156-157 Exercise 41 E here
        LLNode<Integer> temp = numbers;
        int contentList = 1;
        Stack <String> contentStack = new Stack();
        if(temp == null)
        {
            throw new EmptyList("No contained Numbers in reverse");
        }
        else{
            while(temp != null)
            {
                contentStack.push("" + temp.getInfo());
                temp = temp.getLink();
            }
            while(!contentStack.empty())
            {
                System.out.println(contentList + ".\t" + contentStack.pop());
                contentList++;
            }
        }

    }//End methodE

}//End class LLNodeApplication
