package com.company;


//TODO : delete at specfic position error if insert at start and end
//TODO : continous delete from start and end have to fix




public class DoublyLinkedList {

    public static void main(String args[])
    {

        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        doublyLinkList.insert(DoublyLinkList.END,1);
        doublyLinkList.insert(DoublyLinkList.END,2);
        doublyLinkList.insert(DoublyLinkList.END,3);
        doublyLinkList.insert(DoublyLinkList.END,4);
        doublyLinkList.insert(DoublyLinkList.END,2);
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);
        doublyLinkList.insert(0,15);
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        doublyLinkList.delete(1);
        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);

        System.out.println("");
       // doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);
//        doublyLinkList.insert(DoublyLinkList.START,1);
//        doublyLinkList.insert(DoublyLinkList.START,2);
//        doublyLinkList.insert(DoublyLinkList.START,3);
//        doublyLinkList.insert(DoublyLinkList.START,4);
//        doublyLinkList.insert(DoublyLinkList.START,5);
//        doublyLinkList.displayList(DoublyLinkList.REVRSE_ORDER);
//        System.out.println("");
//
//        doublyLinkList.delete(DoublyLinkList.START);
//        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);
//        doublyLinkList.delete(DoublyLinkList.END);
//        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);
//
//        doublyLinkList.delete(1);
//        doublyLinkList.displayList(DoublyLinkList.STRAIGHT_ORDER);









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

        if (insertAt<0||insertAt>length) {
                    System.out.println("Item can't insert here");
                        return;

                    }
                        Node node = start;
                        while (insertAt > 1) {
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

        switch (from)
        {
            case START:

               start =  start.nextNode;
               start.prevNode = null;

            break;
            case END:
                end =  end.prevNode;
                end.nextNode = null;
                break;
                default:
                    if (from<0||from>length) {
                        System.out.println("Item can't delete from here");
                        return;
                    }
                    Node node = start;
                    while (from > 1) {
                        node = node.nextNode;
                        from -= 1;
                    }

                    Node tmpNode = node.nextNode;
                    if (tmpNode==null) {
                        end = node.prevNode;
                    }
                    else
                    {
                        node.prevNode.nextNode = node.nextNode;
                        node.nextNode.prevNode = node.prevNode;

                    }





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






