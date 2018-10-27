package com.company;

import java.util.Scanner;

class Matrix
{
    void set(int str_in, int col_in)
    {
        str = str_in;
        col = col_in;
    }
    void out()
    {
        if (str <= 2|| col <= 2)
        {
            throw new IllegalArgumentException("Too small matrix.");
        }
        int mid_str = str / 2;
        int mid_col = col / 2;
        for (int i = 0; i < str; i++)
        {
            if (i != mid_str)
            {
                for (int j = 0; j < col; j++)
                {
                    if (j != mid_col)
                    {
                        System.out.print("0");
                    } else
                    {
                        System.out.print("7");
                    }
                }
            }
            else
            {
                for (int j = 0; j < col; j++)
                {
                    System.out.print("7");
                }
            }
            System.out.println();
        }
    }
    private int str;
    private int col;
}
public class Main
{
    public static void main(String[] args)
    {
        Matrix matrix = new Matrix();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        matrix.set(N, M);
        matrix.out();
    }
}
