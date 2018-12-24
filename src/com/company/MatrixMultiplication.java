package com.company;

public class MatrixMultiplication {

    public static int matrix1[][] = {{1,2},
                                     {3,4}};

    public static int matrix2[][] = {{1,2},
                                     {3,4}};
    static int r = 2;
    static int c = 2;
    public static int matrix3[][] = new int[2][2];

    public static void main(String args[])
    {
        System.out.print("");

        itrativeMatrixMultiplication();

    }


    public static void itrativeMatrixMultiplication()
    {
        for (int i=0;i<r;i++)
        {
            System.out.println();
            for (int j=0;j<c;j++)
            {

                // System.out.print(matrix1[i][j]+"X"+matrix2[j][i]+"+");
                System.out.print(i+"X"+j+"+");

                for (int k=0;k<r;k++)
                {
                    matrix3[i][j] = matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
                }

            }
        }
    }

    public static void recursiveMatrixMultiplication()
    {

    }

}
