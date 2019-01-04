package com.company;

public class QueenAttack {

    static int queenMovableStepHoriz = 0;
    static int queenMovableStepVertc = 0;
    static int queenMovableLtoRDig = 0;
    static int queenMovableRtoLDig = 0;

    static int chessBoardCols = 3;
    static int chessBoardRows = 3;
    static int chessBoard[][];

    static int queenSittingRow = 0;
    static int queenSittingCol = 0;




    public static void main(String args[])
    {


//        int chessBoardCols = 4;
//        int chessBoardRows = 4;
//        int chessBoard[][] = {
//                {0,0,0,0,0},
//                {0,0,1,0,0},
//                {0,0,0,0,0},
//                {0,1,-1,0,0},
//                {0,0,0,0,1}
//        };
//
//        int queenSittingRow = 3;
//        int queenSittingCol = 2;

        int array[][] = {{5,5},{4,2},{2,3}};

        queensAttack(5,3,4,3,array);

    }


    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {


        chessBoardCols = n-1;
        chessBoardRows = n-1;
        chessBoard = new int[n][n];

        queenSittingRow = r_q-1;
        queenSittingCol = c_q-1;


        for (int i=0;i<k;i++)
        {
            int row = obstacles[i][0];
            int col = obstacles[i][1];
            chessBoard[row-1][col-1] = 1;
        }

        chessBoard[queenSittingRow][queenSittingCol] = -1;


        for (int i=0;i<queenSittingCol;i++)
        {
            int chessBoardItem = chessBoard[queenSittingRow][i];
            int queen = chessBoard[queenSittingRow][queenSittingCol];

            if (chessBoardItem!=queen)
            {
                if (chessBoard[queenSittingRow][i]!=1)
                    queenMovableStepHoriz+=1;
                else break;
            }

        }


        for (int i=queenSittingCol+1;i<chessBoardCols;i++) {
            int chessBoardItem = chessBoard[queenSittingRow][i];
            int queen = chessBoard[queenSittingRow][queenSittingCol];

            if (chessBoardItem != queen) {
                if (chessBoard[queenSittingRow][i] != 1)
                    queenMovableStepHoriz += 1;
                else break;
            }


        }

        for (int i=0;i<queenSittingRow;i++)
        {
            if (chessBoard[i][chessBoardCols]!=chessBoard[queenSittingRow][queenSittingCol])
            {
                if (chessBoard[i][queenSittingCol]!=1)
                    queenMovableStepVertc+=1;
                else break;
            }

        }

        for (int i=queenSittingRow;i<chessBoardRows;i++)
        {
            if (chessBoard[i][chessBoardCols]!=chessBoard[queenSittingRow][queenSittingCol])
            {
                if (chessBoard[i][queenSittingCol]!=1)
                    queenMovableStepVertc+=1;
                else break;
            }

        }


        int queenIndexRow = queenSittingRow-1;
        int queenIndexCol = queenSittingCol-1;

        while (queenIndexRow>=0&&queenIndexCol>=0)
        {
            if(chessBoard[queenIndexRow][queenIndexCol]!=1)
            {
                queenMovableLtoRDig+=1;
            }

            queenIndexRow -= 1;
            queenIndexCol-=1;

        }


        queenIndexRow = queenSittingRow+1;
        queenIndexCol = queenSittingCol+1;

        while (queenIndexRow<=chessBoardRows&&queenIndexCol<=chessBoardCols)
        {
            if(chessBoard[queenIndexRow][queenIndexCol]!=1)
            {
                queenMovableLtoRDig+=1;
            }

            queenIndexRow += 1;
            queenIndexCol+=1;

        }

        queenIndexRow = queenSittingRow+1;
        queenIndexCol = queenSittingCol-1;

        while (queenIndexRow<=chessBoardRows&&queenIndexCol>=0)
        {
            if(chessBoard[queenIndexRow][queenIndexCol]!=1)
            {
                queenMovableRtoLDig+=1;
            }

            queenIndexRow += 1;
            queenIndexCol-=1;

        }

        queenIndexRow = queenSittingRow-1;
        queenIndexCol = queenSittingCol+1;

        while (queenIndexRow>=0&&queenIndexCol<=chessBoardCols)
        {
            if(chessBoard[queenIndexRow][queenIndexCol]!=1)
            {
                queenMovableRtoLDig+=1;
            }

            queenIndexRow -= 1;
            queenIndexCol+=1;

        }


        int totalAvailableStep = queenMovableStepHoriz+queenMovableStepVertc+queenMovableLtoRDig+queenMovableRtoLDig;
        //System.out.print(totalAvailableStep);

return totalAvailableStep;
    }

}
