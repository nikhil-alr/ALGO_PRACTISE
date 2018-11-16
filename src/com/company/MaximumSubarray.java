package com.company;

public class MaximumSubarray {

    public static int array[] = {-8,-1,4,1,-1,3,0};
    public static int maxSubArray = Integer.MIN_VALUE;
    public static void main(String args[])
    {
        int tmp[] = useDivAndConcure(0,array.length-1);
        System.out.print(tmp[0]);
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

        int maxSubarray[] = {0};

if(start>=end)
{
    int tmpArray[] = {array[start]};
    return tmpArray;
}
    int mid = (start+end)/2;
    int lsa[] = useDivAndConcure(start,mid);
    int rsa[] = useDivAndConcure(mid+1,end);
    int totalCroover =  crossover(start,mid,end);

    if (lsa[0]>=totalCroover &&lsa[0]>=rsa[0])
        maxSubarray[0] = lsa[0];

        if (rsa[0]>=totalCroover &&rsa[0]>=lsa[0])
            maxSubarray[0] = rsa[0];

        else
            maxSubarray[0] = totalCroover;


        return maxSubarray;
    }



    public static int crossover(int start,int mid,int end)
    {
        int crossover = 0;

        int leftCrossover = Integer.MIN_VALUE;
        int rightCrossover = Integer.MIN_VALUE;
        int tmpAddition = 0;
        for(int i=mid;i>=start;i--)
        {
            tmpAddition = tmpAddition+array[i];
            if(leftCrossover<tmpAddition)
                leftCrossover = tmpAddition;
        }

        tmpAddition = 0;
        for(int i=mid+1;i<=end;i++)
        {
            tmpAddition = tmpAddition+array[i];
            if(rightCrossover<tmpAddition)
                rightCrossover = tmpAddition;
        }

        crossover = leftCrossover+rightCrossover;

        return crossover;

    }

  //========================= Div and concure required part===================





}
