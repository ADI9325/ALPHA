import java.util.Stack;

class reverseStack {
                    static void stackBottom(Stack<Integer> s, int data){
                                        if(s.isEmpty()){
                                                            s.push(data);
                                                            return;

                                        }
                                        int top = s.pop();
                                        stackBottom(s,data);
                                        s.push(top);
                                        
                    }

                    static void stackReverse(Stack<Integer> s) {
                                        if(s.isEmpty()){
                                                            return;
                                        }
                                  
                                        int a = s.pop();
                                        stackReverse(s);
                                        stackBottom(s, a);
                    }
                    static void printStack(Stack<Integer> s){
                                        while(!s.isEmpty()){
                                                           System.out.println(s.pop());
                                        }
                    }

                    public static void main(String[] args) {
                                        Stack<Integer> s = new Stack<>();
                                        s.push(1);
                                        s.push(2);
                                        s.push(3);
                                        s.push(4);
                                        stackReverse(s);
                                        printStack(s);

                                  


                    }

}