package AddTwoNumbers;

import static org.junit.Assert.assertEquals;

/**
 * Created by julien on 26/03/2016.
 */
public class SolutionTest {

    @org.junit.Test
    public void addTwoNumbers() throws Exception {
        ListNode i1 = createListeNode(2, 8);
        ListNode i2 = createListeNode(4,8);
        ListNode listNode = Solution.addTwoNumbers(i1, i2);
        assertEquals(2,listNode.val);
        assertEquals(6,listNode.next.val);
        assertEquals(6,listNode.next.next.val);
        assertEquals(1,listNode.next.next.next.val);
    }

    @org.junit.Test
    public void addTwoNumbers2() throws Exception {
        ListNode i1 = createListeNode(5, 10);
        i1.next.next.next = new ListNode(20);
        ListNode i2 = createListeNode(8,16);
        i2.next.next.next = new ListNode(40);
        i2.next.next.next.next = new ListNode(2);
        ListNode listNode = Solution.addTwoNumbers(i1, i2);
        assertEquals(2,listNode.val);
        assertEquals(3,listNode.next.val);
        assertEquals(7,listNode.next.next.val);
        assertEquals(2,listNode.next.next.next.val);
        assertEquals(8,listNode.next.next.next.next.val);
    }

    @org.junit.Test
    public void addTwoNumbers3() throws Exception {
        ListNode i1 = new ListNode(1);
        ListNode i2 = new ListNode(9);
        i2.next = new ListNode(9);
        ListNode listNode = Solution.addTwoNumbers(i1, i2);
        assertEquals(0,listNode.val);
        assertEquals(0,listNode.next.val);
        assertEquals(1,listNode.next.next.val);
    }

    private ListNode createListeNode(int x2, int x3) {
        ListNode i1 = new ListNode(1);
        i1.next = new ListNode(x2);
        i1.next.next = new ListNode(x3);
        return i1;
    }
}