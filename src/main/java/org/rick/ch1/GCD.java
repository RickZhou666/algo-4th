package org.rick.ch1;

/**
 * @Author: Rick
 * @Date 2023/8/15
 */
public class GCD {
    public int gcd_algo(int p, int q){
        if (q == 0){
            return p;
        }
        int remainder = p % q;
        return gcd_algo(q, remainder);
    }
}
