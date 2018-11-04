package com.company;

public class MaximumSubarray {

    public static int array[] = {-8,-1,4,1,-3,3,0};
    public static int maxSubArray = Integer.MIN_VALUE;
    public static void main(String args[])
    {
        useLinearAlgo(0,array.length);
        System.out.print(maxSubArray);
    }


    //=========================Old Brute Force required part===================
    public static void useOldBruteForce(int start,int end)
    {
for (int i=start;i<=end;i++)
{

  int chunk = (array.length-1);
    for (int j=i;j<=chunk;j++)
    {
        int localSum = 0;
    for (int k=i;k<=j;k++) {
            localSum += array[k];
        }
if (localSum>maxSubArray)
{
    maxSubArray = localSum;
}
        }
}
    }
    //=========================Old Brute Force required part===================


    //=========================Brute Force required part===================
    public static void useBruteForce(int start,int end)
    {
        for (int i=start;i<=end;i++)
        {
            int chunk = (array.length-1);
            int totalSum = 0;
            for (int j=i;j<=chunk;j++)
            {
                totalSum = totalSum+array[j];

                if (totalSum>maxSubArray)
                    maxSubArray = totalSum;

            }


        }
    }
    //=========================Brute Force required part===================

    //========================= Linear required part===================
    public static void useLinearAlgo(int start,int end)
    {
        int localSum = 0;
        for(int i=start;i<end;i++)
        {
            int oldLocalSum = localSum;
            localSum = localSum+array[i];

            if (localSum>maxSubArray)
                maxSubArray = localSum;

            if (localSum<array[i])
                localSum = array[i];

        }
    }
    //========================= Linear required part===================


  //========================= Div and concure required part===================
    public static int[] useDivAndConcure(int start,int end)
    {

if(start>=end)
{
    int tmpArray[] = {array[start],0};
    return tmpArray;
}
    int mid = (start+end)/2;
    int lsa[] = useDivAndConcure(start,mid);
    int rsa[] = useDivAndConcure(mid+1,end);
    int lcrossover = crossover(start,mid,mid);
    int rcorssover = crossover(mid+1,mid,end);
    int totalCroover =  crossover(start,mid,end);
        int tmpArray[] = new int[2];

    if(totalCroover>=rcorssover&&totalCroover>=lcrossover)
    {
        tmpArray[0] = lcrossover;
        tmpArray[1] = rcorssover;
    }
    else
    {
        if (rcorssover>totalCroover&&rcorssover>lcrossover)
        {
            tmpArray[0] = rcorssover;
            tmpArray[1] = 0;
        }
        else
        {
            tmpArray[0] = lcrossover;
            tmpArray[1] = rcorssover;
        }
    }




        return tmpArray;
    }

    static public int crossover(int start,int mid,int end)
    {
//        int localSum = 0;
//        for(int i=start;i<=end;i++)
//        {
//           int oldLocalSum = localSum;
//                localSum = localSum+array[i];
//
//            if (localSum>maxSubArray)
//                maxSubArray = localSum;
//
//            if (localSum<array[i])
//            {
//                localSum = oldLocalSum;
//            }
//
//        }


        return 0;
    }

  //========================= Div and concure required part===================





}
