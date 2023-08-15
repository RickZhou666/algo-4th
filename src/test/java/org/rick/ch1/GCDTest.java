package org.rick.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Rick
 * @Date 2023/8/15
 */
class GCDTest {

    GCD gcd = new GCD();
    @Test
    public void testGcd(){
        System.out.println(gcd.gcd_algo(7, 3));
    }


}