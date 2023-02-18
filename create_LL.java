
import java.util.LinkedList;

public class create_LL {
                    class Node {
                                        int data;
                                        Node next;

                                        public Node(int data) { // constructor
                                                            this.data = data;
                                                            this.next = null;
                                        }
                    }

                    public static Node head;
                    public static Node tail;

                    public void addFirst(int data) {
                                        // Time comp = O(n);
                                        // step1
                                        Node newNode = new Node(data);
                                        if (head == null) {
                                                            head = tail = newNode;
                                                            return;
                                        }
                                        // step 2 - newNode next = head
                                        newNode.next = head;
                                        // step3 - head=newNode;
                                        head = newNode;

                    }

                    public void addLast(int data) {
                                        // Time comp = O(n);
                                        Node newNode = new Node(data);
                                        if (head == null) {
                                                            head = tail = newNode;
                                                            return;
                                        }
                                        tail.next = newNode;
                                        tail = newNode;
                    }

                    public void print() {
                                        if (head == null) {
                                                            System.out.println("LL is NULL");
                                                            return;
                                        }
                                        Node temp = head;
                                        while (temp != null) {
                                                            System.out.print(temp.data + "->");
                                                            temp = temp.next;
                                        }
                                        System.out.println("null");
                    }

                    public int removeFirst() {

                                        int val = head.data;
                                        head = head.next;
                                        return val;
                    }

                    public int helper(Node head, int key) {
                                        if (head == null) {
                                                            return -1;
                                        }
                                        if (head.data == key) {
                                                            return 0;
                                        }
                                        int i = helper(head.next, key);
                                        if (i == -1) {
                                                            return -1;
                                        }
                                        return i + 1;
                    }

                    public int recSearch(int key) {
                                        return helper(head, key);
                    }

                    public void reverse() {
                                        Node prev = null;
                                        Node curr = tail = head;
                                        Node next;
                                        while(curr!=null){
                                                            next = curr.next;
                                                            curr.next =prev;
                                                            prev =curr;
                                                            curr=next;
                                        }
                                        head =prev;
                    }
                    public void removeNth(int n){
                                        int sz=0;
                                        Node temp=head;
                                        while(temp!=null){
                                                            temp=temp.next;
                                                            sz++;
                                         }
                                         //remove first
                                         if(n==sz){
                                                            head = head.next;
                                                            return;
                                         }
                                        // sz-n
                                        int i=0;
                                        int iTofind =sz-n;
                                        Node prev =head;
                                        while(i<iTofind){
                                                            prev =prev.next;
                                                            i++;
                                        }
                                        prev.next =prev.next.next;
                                        return;

                    }
                     public  boolean loopCycle(){
                                        Node slow = head;
                                        Node fast = head;
                                        while(fast!=null || fast.next!=null){
                                                          slow=slow.next;
                                                          fast = fast.next.next;
                                                          if(slow==fast){
                                                            return true;
                                                          }
                                        } 
                                       return false;
                     }
                    public static void main(String[] args) {
                                        head = new Node(1);
                                        head.next = new Node(2);
                                        head.next.next = new Node(3);
                                        head.next.next.next = head;
                                       System.out.println(loopCycle());


                    }
}
