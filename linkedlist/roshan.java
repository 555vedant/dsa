package linkedlist;
class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) { 
        this.val = val;
     }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class roshan {
    ListNode head = null;
   

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = 0;
        ListNode temp1 = l1;
        while (temp1 != null) {
            val1++;
            temp1 = temp1.next;
        }

        int val2 = 0;
        ListNode temp2 = l2;
        while (temp2 != null) {
            val2++;
            temp2 = temp2.next;
        }

        double sum1 = 0;
        ListNode temp3 = l1;
        for (int i = 0; temp3 != null; i++) {
            sum1 += temp3.val * Math.pow(10, i);
            temp3 = temp3.next;
        }

        double sum2 = 0;
        ListNode temp4 = l2;
        for (int i = 0; temp4 != null; i++) {
            sum2 += temp4.val * Math.pow(10, i);
            temp4 = temp4.next;
        }

        double  sum =  sum1 + sum2;

        ListNode temp = null;
        ListNode l3 = null;
        int summ = (int) sum;

        if (sum == 0) {
            ListNode newNode = new ListNode(summ);
            head = newNode;
            l3 = head;
            temp = l3;
        }

        while (summ != 0) {
            double a = (sum % 10);
            int b = (int) a;

            ListNode newNode = new ListNode(b);
            if (head == null) {
                head = newNode;
                l3 = head;
                temp = l3;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            sum /= 10;
            summ = (int) sum;
        }

        return l3;
    }
    public static void main(String[] args) {
        
        ListNode l1 =new ListNode();
        
        
    }
}