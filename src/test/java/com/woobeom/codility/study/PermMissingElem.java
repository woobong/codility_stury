package com.woobeom.codility.study;

/**
 * Created by wb.heo on 2017-06-12.
 */
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class PermMissingElem {

    private int[] paramArr = new int[]{2,3,1,5};

    private static Integer solution(int[] paramArr) {
        return 0;
    }

    @Test    
    private void shouldReturnIntElement(){
        Integer result = solution(paramArr);
        assertThat(result).isInstanceOf(Integer.class);
    }

}
