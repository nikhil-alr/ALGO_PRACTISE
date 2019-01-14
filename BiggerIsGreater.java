package com.company;

import java.io.*;
import java.nio.Buffer;

public class BiggerIsGreater {
   static int positionOne = 0;
   static int positionTwo = 0;



   public static void main(String args[])
    {
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\prince\\IdeaProjects\\untitled\\out\\production\\untitled\\com\\company\\data.txt")));
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                //System.out.println(line);
//                System.out.println(biggerIsGreater(line));
//
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(biggerIsGreater("ehdegnmorgafrjxvksc"));
       // ehdegnmorgafrjxvskc

    }

    public static String  insertionSort(char[] string,int startPositon)
    {
        for (int i=startPositon;i<string.length-1;i++)
        {

            if (string[i]>string[i+1])
            {
                char tmp = string[i];
                string[i] = string[i+1];
                string[i+1] = tmp;

            }

            int j = i;
            while (j>=startPositon+1&&string[j]<string[j-1])
            {
                char tmp = string[j];
                string[j] = string[j-1];
                string[j-1] = tmp;
j-=1;
            }
        }
    return new String(string);
    }


    public static String biggerIsGreater(String input)
    {
        char stringArray[] = input.toCharArray();
        boolean breakOuter = false;
        for (int i=input.length()-1;i>=1;i--)
        {
            for (int j=i-1;j>=0;j--)
            {
                if (input.charAt(i)>input.charAt(j))
                {
                    positionOne = i;
                    positionTwo = j;

                    char tmp = input.charAt(positionOne);
                    stringArray[positionOne] = input.charAt(positionTwo);
                    stringArray[positionTwo] = tmp;
                    breakOuter = true;
                    String data = new String(stringArray);
                    System.out.print("data"+data);
                    break;
                }


            }

            if (breakOuter)
                break;
        }
        String answerString = "";
        if (positionTwo==0&&positionOne==0) {
            answerString = "no answer";
        }
        else {
            System.out.print(new String(stringArray));

            answerString  = insertionSort(stringArray, positionTwo );
        }


        return answerString.trim();

    }

}
