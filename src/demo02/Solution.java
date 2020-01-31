package demo02;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/1/29
 * Description: 分糖果问题
 */
public class Solution {

    public static int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int len = candies.length;
        // 记录种类
        int sisCount = 0;
        for (int i = 0; i < candies.length; i++) {
            int val = candies[i];
            sisCount++;
            if (sisCount >= len/2)
                return len / 2;
            while (i < len && candies[i] == val) {
                i++;
            }
            i--;


        }
        return sisCount;
    }
    public static void main(String[] args){
        int i = distributeCandies(new int[]{1, 2, 1, 3});
        System.out.println(i);
    }

}
