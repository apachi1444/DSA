package designPatternsDSA;


public class FastAndSlowPointers {
    class Node {

        Node next;
        int val;
    }
    public void fastAndSlowPointersCycleDetection(Node head){
        Node slow_p = head  , fast_p = head;
        int flag = 0;
        while(slow_p != null && fast_p != null && fast_p.next != null){
            slow_p = slow_p.next;
            fast_p = fast_p.next;

            if( slow_p == fast_p){
                flag = 1;
                break;
            }
        }
        if ( flag == 1 ){
            System.out.println("cycle detected");
        }
        else System.out.println("no cycle");
    }
}
