package com.company;

public class MergeSort {

   public static int array[] = {1,6,7,8,9,1,2,3,4,5,6,7,8,9,0,7,6,5,3,4,5,6,1,0,0,0,0,5,4,3,2,1};

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

    static void sort(int start,int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            sort(start,mid);
            sort(mid+1,end);
            merge(start,mid,end);
        }
    }

    static void merge(int start, int mid, int end) {
        int leftSubArraySize = (mid - start) + 1;
        int rightSubArraySize = (end - mid);
        int leftSubArray[] = new int[leftSubArraySize];
        int rightSubArray[] = new int[rightSubArraySize];

        int arrayIndex = 0;
        int leftSubArrayIndex = 0;
        int rightSubArrayIndex = 0;

        for (int i = start; i <= mid; i++) {
            leftSubArray[arrayIndex] = array[i];
            arrayIndex+=1;
        }

        arrayIndex = 0;
        for (int i = mid + 1; i <= end; i++) {
            rightSubArray[arrayIndex] = array[i];
            arrayIndex+=1;
        }
        arrayIndex = start;

        while (leftSubArrayIndex < leftSubArraySize && rightSubArrayIndex < rightSubArraySize) {
            if (leftSubArray[leftSubArrayIndex] < rightSubArray[rightSubArrayIndex]) {
                array[arrayIndex] = leftSubArray[leftSubArrayIndex];
                leftSubArrayIndex += 1;
            } else {
                array[arrayIndex] = rightSubArray[rightSubArrayIndex];
                rightSubArrayIndex += 1;
            }

            arrayIndex += 1;
        }


        while (leftSubArrayIndex < leftSubArraySize) {
                array[arrayIndex] = leftSubArray[leftSubArrayIndex];
                leftSubArrayIndex += 1;

            arrayIndex += 1;
        }

        while (rightSubArrayIndex < rightSubArraySize) {
                array[arrayIndex] = rightSubArray[rightSubArrayIndex];
                rightSubArrayIndex += 1;

            arrayIndex += 1;
        }

    }

}
