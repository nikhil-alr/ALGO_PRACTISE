package com.company;

public class LinkedList {

    static int ERROR_CODE_MEMORY_NOT_PRESENT = -1;
    static int CODE_OPERATION_SUCCESSFULLY = 0;


    public static Node rootNode = null;

    public static void main(String args[])
    {
        System.out.println("Linked List");
         printList();
        insertStart(1);
        insertStart(2);
        insertStart(3);
        insertStart(6);
        insertStart(8);
        insertStart(7);
        insertStart(4);
        insertStart(2);

      printList();


    }

    public static void insertLast(int info)
    {


        if(rootNode==null)
        {
            rootNode = new Node();
            rootNode.setInfo(info);
            rootNode.setPointerNode(null);
        }
        else
        {
            Node node = rootNode;
            while (true)
            {
                if (node.getPointerNode()==null)
                {
                    Node tmpNode = new Node();
                    if (tmpNode==null)
                    {
                        System.out.println("Error:Out Of memory exception");
                        return;
                    }
                    tmpNode.setInfo(info);
                    node.setPointerNode(tmpNode);
                    return;
                }

                node = node.getPointerNode();



            }
        }
    }

    public static void printList()
    {
        Node node = rootNode;
        while (node!=null)
        {
            System.out.print(node.getInfo()+"->");
            node = node.getPointerNode();


        }
    }

    public static void insertStart(int info)
    {
        if(rootNode==null)
        {
            rootNode = new Node();
            rootNode.setInfo(info);
            rootNode.setPointerNode(null);
        }
        else
        {

            Node tmpNode = new Node();
                    if (tmpNode==null)
                    {
                        System.out.println("Error:Out Of memory exception");
                        return;
                    }
                    tmpNode.setInfo(info);
            tmpNode.setPointerNode(rootNode);
                    rootNode = tmpNode;
        }





            }

            public static void insertAt(int position,int info)
            {
                Node locatedNode;
                while (position>0)
                {
                    position-=1;
                    locatedNode = rootNode.getPointerNode();

                }


            }

            public static void deleteStart()
    {}

    public static void deleteEnd()
    {}

    public static void deleteFrom(int position,int info)
    {}
}




class Node
{
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }



    private int info;

    public Node getPointerNode() {
        return pointerNode;
    }

    public void setPointerNode(Node pointerNode) {
        this.pointerNode = pointerNode;
    }

    private Node pointerNode;

}



