package com.company;

public class RolloverLinkedList {


    static RolloverNode startNode = null;

    public static void main(String args[])
    {

       travrse();
       insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);

        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);

        travrse();

    }

    static private boolean createStartNode(int value)
    {
        boolean isStartNodePresent = true;
        if (startNode==null)
        {
            RolloverNode tmpRolloverNode = new RolloverNode();
            tmpRolloverNode.insert(value);
            startNode = tmpRolloverNode;
            isStartNodePresent = false;
        }
        return isStartNodePresent;
    }

    static public void insertAtEnd(int value)
    {

        if (!createStartNode(value))
            return;

       RolloverNode node = startNode;

       while (true) {
           if (node.haveEmptySlots()) {
               node.insert(value);
               return;
           }
           if (node.nextNode==null)
               break;
          node=node.nextNode;
       }

       RolloverNode newNode = new RolloverNode();
       newNode.insert(value);
       node.nextNode = newNode;
    }

    static public void travrse()
    {
        RolloverNode node = startNode;
        while (node != null) {
           node.display();
            node=node.nextNode;
        }
    }

    static public void insertAtStart(int value)
    {
        if (!createStartNode(value))
            return;

        RolloverNode node = startNode;
            if (node.haveEmptySlots()) {
                node.insertAtStart(value);
                return;
            }

        RolloverNode newNode = new RolloverNode();
        newNode.insert(value);
        newNode.nextNode = startNode;
        startNode = newNode;
        }



    }




class RolloverNode
{
    int filledIndex = -1;
    int slots[] = new int[5];
    RolloverNode nextNode;


    public void insert(int value)
    {
        filledIndex+=1;
        slots[filledIndex] = value;
    }

    public void insertAtStart(int value)
    {

        for (int i=filledIndex;i>=0;i--)
        {
            slots[i+1] = slots[i];
        }
        slots[0] = value;
        filledIndex+=1;

    }

    public boolean haveEmptySlots()
    {
        boolean haveEmptySlots = true;

        if (slots.length-1==filledIndex)
        {
            haveEmptySlots = false;
        }

        return haveEmptySlots;
    }

    public void display()
    {
        System.out.print("[");
        for (int i=0;i<=filledIndex;i++)
        {
            System.out.print(slots[i]);
        }
        System.out.print("]");
    }

}
