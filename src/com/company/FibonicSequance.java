package com.company;

public class FibonicSequance {

    public static void main(String args[])
    {

        int newItem = 1;
        int oldItem = 0;
        int i=0;

        System.out.println(newItem);
        while(i<10)
        {
            int newCalItem = newItem+oldItem;
             System.out.println(newCalItem);
            oldItem = newItem;
            newItem = newCalItem;
            i+=1;
        }

    }

}
