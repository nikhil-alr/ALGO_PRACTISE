package com.company;

import java.util.StringTokenizer;

public class EncryptionTool {

    public static void main(String args[])
    {
        String planText = "chillout";
        StringTokenizer st = new StringTokenizer(planText);
        String planSpaceRemovedText = "";
        while (st.hasMoreTokens())
        {
            planSpaceRemovedText = planSpaceRemovedText+""+st.nextElement();
        }

        int planTextLength = planSpaceRemovedText.length();


     int squareRoot[]= getRoot(planTextLength);
     int intialIndex = 0;
     int endIndex = 0;
        String encryptedString[] = new String[squareRoot[1]];


        for (int i=0;i<squareRoot[0];i++)
     {
         intialIndex = endIndex;
         endIndex = endIndex+squareRoot[1];
         int indexInc = -1;
         for (int j=intialIndex;j<endIndex;j++)
         {

             indexInc+=1;
             if (j==planTextLength)
                 break;
             System.out.print(planSpaceRemovedText.charAt(j));
             if(encryptedString[indexInc]==null)
                 encryptedString[indexInc] = "";
             encryptedString[indexInc] =  encryptedString[indexInc]+planSpaceRemovedText.charAt(j);

         }
         System.out.println("");
     }


        for (int j=0;j<=squareRoot[0];j++)
        {
            System.out.print(encryptedString[j]+" ");
        if (j==squareRoot[0])
            System.out.print(encryptedString[j]);

        }

    }


    public static int[] getRoot(int number)
    {
        int root[] = new int[2];
        int floor = 0;
        int celling = 0;

        for (int i=1;i<number/2;i++)
        {
            int squreRoot = i*i;
            if(squreRoot==number) {
                floor = celling = i;
break;
            }
            if (squreRoot>number)
        {
            floor = i-1;
            celling = i;
            break;
        }
        }

        root[0] = floor;
        root[1] = celling;
        return root;

    }
}





