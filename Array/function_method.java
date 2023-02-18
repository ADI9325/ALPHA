package Array;
import java.util.*;

public class function_method {
                    public static int calculate_num(int a,int b) {
                                       
                                        int multiply = a * b;
                                        return multiply;

                    }

                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        int a = sc.nextInt();
                                        int b = sc.nextInt();
                                        
                                        System.out.println("The product is " +calculate_num(a, b));

                    }

}
