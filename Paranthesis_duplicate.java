import java.util.*;
public class Paranthesis_duplicate {
                    public static boolean isduplicate1(String str) {
                                        Stack<Character> s = new Stack<>();
                                        for (int i = 0; i < str.length(); i++) {
                                                            char ch = str.charAt(i);
                                                            if (ch == ')') {
                                                                                int count = 0;
                                                                                while (ch != '(') {
                                                                                                    s.pop();
                                                                                                    count++;
                                                                                }
                                                                                if (count < 1) {
                                                                                                    return true;
                                                                                } else {
                                                                                                    s.pop();
                                                                                }
                                                            } else {
                                                                                s.push(ch);
                                                            }
                                        }
                                        return false;

                    }

                    public static void main(String[] args) {
                                        String str1 = "(a+b)";
                                        String str2 = "(a)+(b)";
                                        System.out.println(isduplicate1(str1));

                    }
                    
}
