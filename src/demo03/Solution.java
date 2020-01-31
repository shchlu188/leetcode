package demo03;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/1/31
 * Description:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数的下标并返回此下表组成的数组
 * 同样的元素不能重复利用
 */
public class Solution {

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[]{i, j};
                }

            }
        }
        throw new IllegalArgumentException("num is not exist");
    }

    public static int[] twoSum2(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            int com = target - arr[i];
            if(map.containsKey(com) && map.get(com) != i){
                return new int[]{i,map.get(com)};
            }
        }
        throw new IllegalArgumentException("num is no exist");
    }
}
