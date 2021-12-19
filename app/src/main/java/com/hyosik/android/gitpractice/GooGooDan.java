package com.hyosik.android.gitpractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GooGooDan {

    static long[] fibo_memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fibo_memo = new long[i + 1];
        // 0 1 1 2 3 5
        long start_fibo = System.nanoTime();
        System.out.println(fibo(i));
        long end_fibo = System.nanoTime();
        System.out.println(end_fibo - start_fibo);
        

        long start_fibo_dynamic = System.nanoTime();
        System.out.println(fibo_dynamic(i));
        long end_fibo_dynamic = System.nanoTime();
        System.out.println(end_fibo_dynamic - start_fibo_dynamic);

        System.out.println("FIBO1");


        System.out.println("FIBO2");


    }
    private static int fibo(int i) {

        if(i <=1) return i;

        return fibo(i-1) + fibo (i-2);

    }
    private static long fibo_dynamic(int i) {

        if(i == 0) return 0;
        else if(i == 1) return 1;

        fibo_memo[0] = 0;
        fibo_memo[1] = 1;

        for (int j =2; j <= i; j ++) {

            fibo_memo[j] = fibo_memo[j-1] + fibo_memo[j-2];
        }

        return fibo_memo[i];
    }

}

