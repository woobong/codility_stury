package com.woobeom.codility.study;

/**
 * Created by wb.heo on 2017-06-14.
 */

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJmp {

    private int x;
    private int y;
    private int d;

    @Test
    public void setup(){
        x = 10;
        y = 120;
        d = 30;

        int result = solution2(x,y,d);

        System.out.println(result);

        assertThat(result).isEqualTo(4);

    }

    private static Integer solution(int x, int y, int d) {
        return ( y - x ) % d > 0 ? ( y - x ) / d + 1 : ( y - x ) / d;
    }

    private static int solution2(int x, int y, int d) {

        double _x = (double) x;
        double _y = (double) y;
        double _d = (double) d;
        double result = (_y - _x) / _d;

        return (int) Math.ceil(result);
    }

}
