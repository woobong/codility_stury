package com.woobeom.codility.study;

import org.junit.Test;

import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by wb.heo on 2017-06-01.
 */
public class BinaryGap {

    int solution(int n) {

        int max = 0;
        String binaryStr = Integer.toBinaryString(n).replaceAll("0+$", "");

        String[] splitedZero = binaryStr.split("1+");

        for (int i = 0; i < splitedZero.length; i++) {
            int length = splitedZero[i].length();
            if (length > max) {
                max = length;
            }
        }

        return max;
    }

    int solution2(int n) {
        return Stream.of(
                Integer.toBinaryString(n).replaceAll("0+$", "").split("1+")
        )
                .filter(a -> a != null && a.length() > 0)
                .max(Comparator.comparingInt(String::length))
                .map(String::length)
                .orElse(0);
    }


    @Test
    public void runSolution() {

        int result = solution(529);
        assertEquals(result, 4);

        result = solution2(529);
        assertEquals(result, 4);

    }

    @Test
    public void optionalValueReturn() {
        System.out.println(Stream.of(
                Integer.toBinaryString(529).replaceAll("0+$", "").split("1+")
                )
                        .filter(a -> a != null && a.length() > 0)
                        .max(Comparator.comparingInt(String::length))
                        .map(String::length)
        );

    }
}
