package algorithm;

/**
 * Created by huan on 2017/10/19.
 * 找出单链表的中间节点
 */
public class MidLinkedList {

    static class LinkedList<T> {
        T value;
        LinkedList next;

        public LinkedList(T value) {
            this.value = value;
        }
    }

    public LinkedList solution(LinkedList list) {
        if (list == null) {
            return null;
        }

        // 快指针每次走两步，慢指针每次走一步
        LinkedList fast = list;
        LinkedList slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(1);
        list.next = new LinkedList(2);
        list.next.next = new LinkedList(3);
        System.out.println(new MidLinkedList().solution(list).value);
    }
}