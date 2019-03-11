package com.company;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ShubhamXor {

    public static void main(String args[])
    {
        int xorCount = 0;
        Scanner scanner = new Scanner(System.in);

        int arrayLength= scanner.nextInt();
        String inputArray = scanner.nextLine();
        inputArray = scanner.nextLine();
        //System.out.println(inputArray);
        int array[] = new int[arrayLength];
        int statusArray[] = new int[arrayLength];
        StringTokenizer stringTokenizer = new StringTokenizer(inputArray);
        int index=0;
        while (stringTokenizer.hasMoreElements())
        {
            array[index] = Integer.parseInt(stringTokenizer.nextElement().toString());
            statusArray[index] = 1;
            index+=1;
        }

         xorCount = bubbleSort(array);
        //while (i<arrayLength-1)
//        for (int i=0;i<arrayLength-1;i++)
//        {
//            if (statusArray[i]==0)
//                continue;
//            for (int j=i+1;j<arrayLength;j++)
//            {
//                if ((array[i]==array[j])&&statusArray[j]==1)
//                {
//                    xorCount+=1;
//                    statusArray[j] = 0;
//                    break;
//
//                }
//            }
//
//        }
  //      System.out.println(xorCount);
    }

    static int bubbleSort(int [] inputArray)
    {
        int sortedArray[] = inputArray;
        int xorCount = 0;
        for (int i=0;i<inputArray.length-1;i++)
        {
            for (int j=0;j<inputArray.length-1;j++)
            {

                if (inputArray[j]>inputArray[j+1])
                {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }

            }

            if (i%2!=0)
            {
                if(sortedArray[i]==sortedArray[i-1])
                {
                    xorCount+=1;

                }
            }

        }

//        System.out.print(xorCount);
        return xorCount;
    }
}
