package com.company;



public class DoublyLinkedList {

    public static void main(String args[])
    {

        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        doublyLinkList.insert(DoublyLinkList.END,2);
        doublyLinkList.insert(DoublyLinkList.END,3);
        doublyLinkList.insert(DoublyLinkList.END,4);
        doublyLinkList.insert(DoublyLinkList.END,5);

        System.out.println("");
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);
        System.out.println("");
        doublyLinkList.displayList(DoublyLinkList.REVRSE_ORDER);
        doublyLinkList.update(2,60);
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);


    }





}


class DoublyLinkList
{
    Node start;
    Node end;
    int length;


    static final int START = -1;
    static final int END = -2;
    static final int REVRSE_ORDER = 2;
    static final int STRAIGHT_ORDER = 1;

    private class Node
    {
        Node prevNode;
        int data;
        Node nextNode;

        Node(int value)
        {
            data = value;
            prevNode = null;
            nextNode = null;
        }

    }


    public void insert(int insertAt,int value)
    {
        Node newNode = new Node(value);

        if (start==null)
        {
            start = newNode;
            end = newNode;
            length +=1;
            return;
        }

        switch (insertAt)
        {
            case START:
                newNode.nextNode = start;
                start.prevNode = newNode;
                start = newNode;
                break;
            case END:
                newNode.prevNode = end;
                end.nextNode = newNode;
                end = newNode;
                break;
       default:
        //TODO fix insert at specfic postion also mannage start case
        if (insertAt<0||insertAt>length) {
                    System.out.println("Item can't insert here");
                        return;

                    }
                        Node node = start;
                        while (insertAt == 0) {
                            node = node.nextNode;
                            insertAt -= 1;
                        }

           Node tmpNode = node.nextNode;
           if (tmpNode==null) {
               end = newNode;
               newNode.prevNode = node;
               node.nextNode = newNode;
           }
           else
           {
               node.nextNode = newNode;
               newNode.prevNode = node;

               newNode.nextNode = tmpNode;
               tmpNode.prevNode = newNode;

           }





                    }




        length +=1;
    }

    public void delete(int from)
    {

//TODO make delete module
        switch (from)
        {
            case START:
            break;
            case END:
                break;
                default:

        }

        length -= 1;
    }

    public void update(int updateAt,int value)
    {
        if (updateAt<0||updateAt>length) {
            System.out.println("can't update here");
            return;

        }
        Node node = start;
        while (updateAt > 0) {
            node = node.nextNode;
            updateAt -= 1;
        }

        node.data = value;

    }

    public void displayList(int order)
    {
        System.out.println();
        if (length==0) {
            System.out.println("No data present");
            return;
        }
        Node node = null;
        switch (order)
        {
            case STRAIGHT_ORDER:
               node = start;
                while(node.nextNode!=null)
                {
                   System.out.print(node.data+",");
                   node = node.nextNode;
                }
                break;

            case REVRSE_ORDER:
                node = end;
                while(node.prevNode!=null)
                {
                    System.out.print(node.data+",");
                    node = node.prevNode;
                }
                break;
        }

        System.out.print(node.data);

    }
}






