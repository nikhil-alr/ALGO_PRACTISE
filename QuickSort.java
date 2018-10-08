package com.company;

public class QuickSort {

    static int array[] = {6,4,3,2,1,0,1,2,3,4,5,6,9,8,7,6,5,4,3,1,9,9,9,0,-1,-2};

    public static void main(String args[])
    {
sort(0,array.length-1);

printArray();
    }

    static void printArray()
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    public static void sort(int start,int end)
    {
        if(start<end)
        {
            int mid = partiton(start,end);
            sort(start,mid-1);
            sort(mid+1,end);
        }
    }

    public static int partiton(int start,int end)
        {

           int pivotValue = array[end];
           int pivotGroup = start-1;

           for (int i=start;i<end;i++)
           {
               if (pivotValue>array[i])
               {
                   pivotGroup+=1;
                   int tmp = array[i];
                   array[i] = array[pivotGroup];
                   array[pivotGroup] = tmp;
               }
           }

           int tmp = array[pivotGroup+1];
           array[pivotGroup+1] = array[end];
           array[end] = tmp;
            return pivotGroup+1;
        }
}
