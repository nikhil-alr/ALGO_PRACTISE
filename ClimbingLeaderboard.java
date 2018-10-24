package com.company;

public class ClimbingLeaderboard {

    //5,25,50,120

    public static int leadrBoard[] = {100,100,50,40,40,20,10};
    public static int scorePosition = 0;

    public static void main(String args[])
    {
        leadrBoard[leadrBoard.length-1] = 5;
        scorePosition = leadrBoard.length-1;
        System.out.println(scorePosition);

        calculateRank();
        leadrBoard[scorePosition] = 25;
        calculateRank();

        leadrBoard[scorePosition] = 50;
        calculateRank();


        leadrBoard[scorePosition] = 120;
        calculateRank();


        System.out.println(scorePosition);
    }


    public static void calculateRank()
    {
        int tmpScorePosition = scorePosition;
        int tmpScore = leadrBoard[scorePosition];
        for(int i=0;i<=scorePosition;i++)
        {
            if(scorePosition==i)
                continue;

            if(leadrBoard[scorePosition]>=leadrBoard[i])
            {
                tmpScorePosition = i;
                break;

            }
        }

        int i = leadrBoard.length-1;
        while (i>tmpScorePosition&&i>0)
        {
            leadrBoard[i] = leadrBoard[i-1];
            i-=1;
        }
        leadrBoard[i] = tmpScore;
        scorePosition = tmpScorePosition;
    }

}
