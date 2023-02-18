public class linkedListAdd {
                    public static class Node {
                                        int data;
                                        Node next;

                                        public Node(int data) {
                                                            this.data = data;
                                                            this.next = null;
                                        }
                    }

                    public static Node head;
                    public static Node tail;
                    public static int size;

                    public void addFirst(int data) {
                                        size++;
                                        Node newNode = new Node(data);
                                        if (head == null) {
                                                            head = tail = newNode;
                                                            return;
                                        }

                                        newNode.next = head;
                                        head = newNode;

                    }

                    public void printData() {
                                        Node temp = head;
                                        while (temp != null) {
                                                            
                                                            System.out.print(temp.data + " -> ");
                                                            temp = temp.next;
                                        }

                    }

                    public void addMid(int data, int index) {
                                        Node newNode = new Node(data);
                                        int i = 0;
                                        Node temp = head;
                                        while (i < index - 1) {
                                                            temp = temp.next;
                                                            i++;
                                        }
                                        newNode.next = temp.next;
                                        temp.next = newNode;
                    }

                    public int removeFirst() {
                                        int val = head.data;
                                        head = head.next;
                                        return val;
                    }

                    public void removeLast() {
                                        int val;
                                        Node prev = head;
                                        while (prev.next == null) {

                                                            prev = tail;
                                        }

                    }

                    public int search(int value) {
                                        int indx = 0;
                                        Node temp = head;
                                        while (temp != null) {
                                                            if (value == temp.data) {
                                                                                return indx;
                                                            }
                                                            temp = temp.next;
                                                            indx++;

                                        }
                                        return -1;

                    }

                    public int helper(int key, Node head) {
                                        if (head == null) {
                                                            return -1;
                                        }
                                        if (head.data == key) {
                                                            return 0;
                                        }
                                        int idex = helper(key, head.next);
                                        if (idex == -1) {
                                                            return -1;
                                        }

                                        return idex + 1;
                    }

                    public int recSearch(int key) {
                                        return helper(key, head);
                    }

                    public void reverseLl() {
                                        Node prev = null;
                                        Node curr = head;
                                        Node next;
                                        while (curr != null) {
                                                            next = curr.next;
                                                            curr.next = prev;
                                                            prev = curr;
                                                            curr = next;

                                        }
                                        head = prev;
                    }
                    public void delNterm(int n){
                                        Node temp=head;
                                        int sz = 0;
                                        while(temp!=null){
                                                            temp=temp.next;
                                                            sz++;
                                        }
                                        if(n==sz){
                                                            head=head.next;
                                                            return;
                                        }
                                        int i = 0;
                                        int itoFind = sz-n;
                                        Node prev=head;
                                        while(i<itoFind){
                                                         prev =   prev.next ;
                                                         i++;
                                        }
                                        prev.next=prev.next.next;
                                        return;


                    }

                    public static void main(String[] args) {
                                        linkedListAdd ll = new linkedListAdd();
                                        ll.addFirst(1);
                                        ll.addFirst(2);
                                        ll.addFirst(3);
                                        ll.addFirst(4);
                                        ll.addFirst(5);
                                      
                                        ll.delNterm(2);
                                        ll.printData();
                                      
                                      

                    }

}
