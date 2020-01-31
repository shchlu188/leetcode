package demo01;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/1/28
 * Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义一个根节点
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;
            int sumValue = l1Value + l2Value + carry;
            carry = sumValue / 10;
            ListNode sum = new ListNode(sumValue%10);
            cursor.next = sum;
            cursor = sum;
            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }
        return root.next;
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(2);
        listNode.add(4).add(3);
        System.out.println(listNode);
        ListNode listNode1 = new ListNode(5);
        listNode1.add(6).add(4);
        System.out.println(listNode1);
        ListNode listNode2 = new Solution().addTwoNumbers(listNode, listNode1);
        System.out.println(listNode2);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode add(int num){
        this.next = new ListNode(num);
        return this.next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}