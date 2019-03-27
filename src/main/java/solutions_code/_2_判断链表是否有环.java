package solutions_code;

import java.util.HashSet;
import java.util.Set;

public class _2_判断链表是否有环 {

    public boolean hadCycle(ListNode head) {
        Set<ListNode> nodeList = new HashSet<ListNode>();
        ListNode cur = head;
        while ( cur != null ){
            if ( nodeList.contains(cur) ) {
                return true;
            } else {
                nodeList.add(cur);
            }
            cur = cur.next;
        }
        return false;
    }


    class ListNode {
        int val;
        ListNode next;
    }
}
