package com.company;

public class GridSearch {

    static String grid[] = {
            "123412",
            "561212",
            "123634",
            "781288"};


    static String pattern[] = {
            "12",
            "34"};

    static int pattrenHash[][];

    public static void main(String args[])
    {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == pattern[0].charAt(0)) {
                    int matchedRow = 0;
                    boolean isLastRowMatched = true;
                    int gridRow = i;
                    while (isLastRowMatched && matchedRow < pattern.length && gridRow < grid.length) {
                        isLastRowMatched = comparePatternRow(gridRow, j, matchedRow);
                        if (isLastRowMatched)
                            matchedRow += 1;
                        gridRow += 1;

                    }
                    if (matchedRow == pattern.length) {
                        System.out.print("YES");
                    }

                }
            }
        }

    }

    static   boolean comparePatternRow(int row,int col,int pattrenRow)
    {
        boolean isRowMatched = true;
int gridRowSize = col+(pattern[pattrenRow].length()-1);

        if (gridRowSize>grid[0].length()-1)
            return false;
int patternCol = 0;

        for (int i=col;i<=gridRowSize;i++)
        {
            if (grid[row].charAt(i)!=pattern[pattrenRow].charAt(patternCol))
            {
                isRowMatched = false;
                break;
            }
            patternCol+=1;

        }

        return isRowMatched;
    }

}
