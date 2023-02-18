package Array;
public class fibonacci_series {
                    static int fib(int n){
                                       if(n==0 || n==1){
                                         return n;
                                       }
                                        
                                         int Nm1 = fib(n-1);
                                         int nm2 = fib(n-2);
                                         int sum = Nm1+nm2;
                                      
                                       return sum;

                    }
                    public static void main(String[] args) {
                                        System.out.println(fib(25));
                    }
}
