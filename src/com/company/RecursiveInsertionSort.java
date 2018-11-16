package com.company;

public class RecursiveInsertionSort {

    public static int array[] = {9,8,7,6,5,4,3,2,1,5,5,1,2,3,1,9};

    public static void main(String[] args) {
        // write your code here
        insertionSort(0);
        printArray(0);
    }


    public static void insertionSort(int position)
    {
        if (position<array.length-1)
        {
            if(array[position]>array[position+1])
            {
                int tmp = array[position];
                array[position] = array[position+1];
                array[position+1] = tmp;
                shiftArray(position);
            }
            insertionSort(position+1);

        }

    }

    public static void shiftArray(int position)
    {
        if (position>0)
        {
            if (array[position]<array[position-1])
            {
                int tmp = array[position];
                array[position] = array[position-1];
                array[position-1] = tmp;
            }
            shiftArray(position-1);
        }
    }

    public static void printArray(int position)
    {
        if (position<array.length) {
            System.out.print(array[position]);
            printArray(position+1);
        }

    }


}
