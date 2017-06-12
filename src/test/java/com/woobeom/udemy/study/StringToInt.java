package com.woobeom.udemy.study;

/**
 * Created by wb.heo on 2017-06-01.
 */
public class StringToInt {

    public static int convert(String s) {
        char[] ca = s.toCharArray();
        int num = 0;
        for (char c: ca){
            num = num * 10;
            // num = num + Integer.parseInt(String.valueOf(c));
            num += c - '0';
            // ascii 정수 0의 char 값을 빼면, 정수값이 나온다.
            System.out.println(num);
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(convert("321"));
    }
}
