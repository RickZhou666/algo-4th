package org.rick.ch1;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.BAD_CONTEXT;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @Author: Rick
 * @Date 2023/8/15
 */
class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        Scanner in = new Scanner(System.in);


        int key = 5;
        int[] a = {1, 3, 5, 6, 7};
        int ans = BinarySearch.rank(key, a);
        System.out.println(ans);
    }

}