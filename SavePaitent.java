package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SavePaitent {

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();


        String canPatientSave = "YES";

        //System.out.println(inputArray);
        int patientPoint[] = new int[m];
        int vaccsinePoint[] = new int[m];

        String inputArray = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputArray);
        int index=0;
        while (stringTokenizer.hasMoreElements())
        {
            vaccsinePoint[index] = Integer.parseInt(stringTokenizer.nextElement().toString());
            index+=1;
        }


        inputArray = scanner.nextLine();
        stringTokenizer = new StringTokenizer(inputArray);
        index=0;
        while (stringTokenizer.hasMoreElements())
        {
            patientPoint[index] = Integer.parseInt(stringTokenizer.nextElement().toString());
            index+=1;
        }

        for (int i=0;i<5;i++)
        {
            if (vaccsinePoint[i]<patientPoint[i])
            {
                canPatientSave = "NO";
            }

        }

        System.out.println(canPatientSave);
    }

}
