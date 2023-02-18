public  class search_KEy {
                    class Node{
                                        int data;
                                        Node next;
                                        public Node(int data){
                                                            this.data=data;
                                                            this.next=null;
                                        }
                    }
                    public static Node head;
                    public static Node tail;
                
                    public void addFirst(int data){
                                        Node newNode = new Node(data);
                                        if(head==null){
                                                            head=tail=newNode;
                                                            return;
                                        }
                                        newNode.next=head;
                                        head=newNode;
                    }
                    public void addLast(int data){
                                        Node newNode = new Node(data);
                                        if(head==null){
                                                            head=tail=newNode;
                                                            return;
                                        }
                                        tail.next=newNode;
                                        tail=newNode;
                    }
                    public void print(){
                                        if(head==null){
                                                            System.out.println("LL is NULL");
                                                            return;
                                        }
                                        Node temp = head;
                                        while(temp!=null){
                                                            System.out.print(temp.data+"->");
                                                            temp=temp.next;
                                        }
                                        System.out.println("null");
                    }
                    public int itrSearch(int Key){
                                        Node temp = head;
                                        int i=0;
                                        while(temp!=null){
                                                            if(temp.data==Key){
                                                                                return i;

                                                            }
                                                            temp =temp.next;
                                                            i++;
                                        }
                                        return -1;
                    }

                    public  static boolean loopCycle(){
                                      
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
                                        head =  new Node(1);
                                        head.next = new Node(2);
                                        head.next.next = new Node(3);
                                        head.next.next.next = head;
                                       System.out.println(loopCycle());


                    }
                                        
                    }
                    
