package demo01;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/1/28
 * Description:给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Solution1 {
    public int reverse(int num) {
        long x = 0;
        while (num != 0) {
            x = x * 10 + num % 10;
            num = num / 10;
        }
        return (int) x == x ? (int) x : 0;
    }
}
