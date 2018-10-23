package com.company;

import java.util.ArrayList;
import java.util.List;

public class LongFactorial {

    public static List<Integer> arrayList = new ArrayList<Integer>();
    public static List<Integer> arrayListNew = new ArrayList<Integer>();


    public static void main(String args[])
    {
        //System.out.print("Extra lon fact");
        int value = 27;
        extraLongFact(value);
    }


    static void extraLongFact(int value)
    {
        storeItem(value);
        for (int i=value-1;i>1;i--)
        {
            findFact(i);
        }
       printFact();
    }


    static void storeItemNewArray(int value)
    {

       if(value<9)
       {
         arrayListNew.add(value);
       }
       else
       {
           while (value>=1)
           {
               int tmp = value%10;
               arrayListNew.add(tmp);
               value = value/10;
           }
       }
    }


    static void storeItem(int value)
    {
        if(value<9)
        {
            arrayList.add(value);
        }
        else
        {
            while (value>=1)
            {
                int tmp = value%10;
                arrayList.add(tmp);
                value = value/10;
            }
        }


    }

    static void findFact(int value)
    {
        int carry = 0;
        arrayListNew = new ArrayList<Integer>();
for (int i = 0;i<arrayList.size();i++)
{
    int calculateVal = ((arrayList.get(i))*value)+carry;
    carry = 0;
    if(calculateVal>=10)
    {
        int tmpValueStore = calculateVal%10;
        carry = calculateVal/10;
        storeItemNewArray(tmpValueStore);

    }
    else
    {
        storeItemNewArray(calculateVal);
    }

}
if (carry>0) {
    storeItemNewArray(carry);
}
        arrayList.clear();
        arrayList = arrayListNew;
        //printFact();
    }

    static void printFact()
    {

for (int i=arrayList.size()-1;i>=0;i--)
{

    System.out.print(arrayList.get(i));
}
System.out.println("");
    }
}
