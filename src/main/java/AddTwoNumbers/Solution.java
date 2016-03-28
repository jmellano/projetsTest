package AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julien on 26/03/2016.
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> retourList = new ArrayList<ListNode>();
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        int i = 0;
        int retenu = 0;
        while (currentNode1 != null || currentNode2 != null) {
            ListNode current = new ListNode(0);
            int val1 = currentNode1 == null ? 0 : currentNode1.val;
            int val2 = currentNode2 == null ? 0 : currentNode2.val;
            current.val = (retenu + val1 + val2) % 10;
            retenu = (int) (retenu + val1 + val2) / 10;

            if (currentNode1 != null) {
                currentNode1 = currentNode1.next;
            }
            if (currentNode2 != null) {
                currentNode2 = currentNode2.next;
            }
            int j = i;
            retourList.add(current);
            i++;
        }
        while (retenu > 0) {
            ListNode current = new ListNode(0);
            current.val = retenu % 10;
            retenu = (int) retenu / 10;
            retourList.add(current);
        }
        ListNode retour = new ListNode(0);
        for (int j = retourList.size() - 1; j >= 0; j--) {
            retour.val = retourList.get(j).val;
            if (j > 0) {
                ListNode node = new ListNode(retour.val);
                if (retour.next != null) {
                    node.next = retour.next;
                }
                retour.next = node;
            }
        }
        return retour;
    }
}
