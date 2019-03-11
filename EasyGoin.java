package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EasyGoin {


    public static void main(String args[])
    {

        System.out.println("Easy Goin");
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int t=testCase;t>0;t--)
        {
            int maxSum = 0;
            int minSum = 0;

            int m = scanner.nextInt();
            int n = scanner.nextInt();
            String inputArray = scanner.nextLine();
            inputArray = scanner.nextLine();
            //System.out.println(inputArray);
            int array[] = new int[m];
            StringTokenizer stringTokenizer = new StringTokenizer(inputArray);
            int index=0;
            while (stringTokenizer.hasMoreElements())
            {
                array[index] = Integer.parseInt(stringTokenizer.nextElement().toString());
                index+=1;
            }

            array = bubbleSort(array);

            int lenth = m-n;
            //System.out.println("Lenght"+lenth);

            for (int i=0;i<lenth;i++)
            {
                minSum=minSum+array[i];
            }


            //System.out.println("R_Lenght"+((array.length)-lenth));

            for (int i=array.length-1;i>=(array.length)-lenth;i--)
            {
                maxSum=maxSum+array[i];
            }

            //System.out.println("maxSum"+maxSum);
            //System.out.println("minSum"+minSum);
            System.out.println((maxSum-minSum));

        }


    }


    static int[] bubbleSort(int [] inputArray)
    {
        int sortedArray[] = inputArray;

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
        }

        return sortedArray;
    }
}
