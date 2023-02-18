import java.util.*;
import java.util.Stack;

public class reverseSting {
                    public static String StringReverse(String str) {
                                        Stack <Character> s = new Stack<>();
                                        int i = 0;
                                        while (i < str.length()) {
                                                            s.push(str.charAt(i));
                                                            i++;
                                        }

                                        StringBuilder newstring = new StringBuilder("");
                                        while (!s.isEmpty()) {
                                                            char curr = s.pop();
                                                            newstring.append(curr);

                                        }
                                        return newstring.toString();

                    }

                    public static void main(String[] args) {
                                        String str = "helloworld";
                                        
                                        System.out.println(StringReverse(str));

                    }

}
