import java.util.Stack;
// time comp:O(n);
public class pushBottom {

                    public static void pushAtbottom(Stack<Integer> s , int data){
                                        if(s.isEmpty()){
                                                            s.push(data);
                                                            return;
                                        }
                                        int a = s.pop();
                                        pushAtbottom(s, data);
                                        s.push(a);
                    }
                    public static void main(String[] args) {
                                        Stack<Integer> s = new Stack<>();
                                        s.push(1);
                                        s.push(2);
                                        s.push(3);
                                        pushAtbottom(s, 5);
                                        while(!s.isEmpty()){
                                                            System.out.println(s.pop());
                                        }
                    }
                    
}
