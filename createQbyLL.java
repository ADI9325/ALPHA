import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.xml.crypto.Data;

class createQbyLL {
                    static class Queue {
                                        static Stack<Integer> s1 = new Stack<>();
                                        static Stack<Integer> s2 = new Stack<>();

 // isEmpty
                                        public static boolean isEmpty() {
                                                            return s1.isEmpty();
                                        }

// add
                                        public static void add(int data) {
                                                            while (!s1.isEmpty()) {
                                                                                s2.push(s1.pop());
                                                            }
                                                            s1.push(data);
                                                            while (!s2.isEmpty()) {
                                                                                s1.push(s1.pop());
                                                            }
                                        }
 // remove
                                        public static int remove() {
                                                            if (isEmpty()) {
                                                                                System.out.println("Queue is empty");
                                                                                return -1;
                                                            }
                                                            return s1.pop();
                                        }

                                        // peeek
                                        public static int peek() {
                                                            if (isEmpty()) {
                                                                                System.out.println("Queue is empty");
                                                                                return -1;
                                                            }
                                                            return s1.peek();

                                        }
                    }

                    public static void main(String[] args) {
                                        Queue q = new Queue();
                                        q.add(40);
                                        q.add(39);
                                        q.add(38);
                                        q.add(37);
                                        while (!q.isEmpty()) {
                                                            System.out.println(q.peek());
                                                            q.remove();
                                        }

                    }
}