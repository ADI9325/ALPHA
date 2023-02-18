package Array;
import java.util.Scanner;

//factorial = n × (n - 1)!
public class fact_num {
                    public static int fact(int n) {

                                       if(n==0){
                                        return 1;
                                       }
                                        int ft = fact(n-1)*n;
                                        return ft;
                                    


                    }
                    public static int sum(int n ){
                                        if(n==1){
                                                            return 1;
                                        }
                                        int ab =  sum(n-1);
                                        return ab+=n;
                                       
                    }
                    public static int fibb(int n){
                                        if(n==0 || n==1){
                                                            return n;
                                        }
                                        return fibb(n-2)+fibb(n-1);

                    }

                    // public static int Binomial(int n,int r){
                    //                     int fact_n=fact(n);
                    //                     int fact_r=fact(r);
                    //                     int nmr = fact(n-r);
                    //                     int Binomial=fact_n/(fact_r*nmr);
                    //                     return Binomial;

                    // }

                    public static void main(String[] args) {
                                        // Scanner sc = new Scanner(System.in);
                                        // int n = sc.nextInt();
                                        // int r = sc.nextInt();
                                       // System.out.println(Binomial(n, r));
                                       System.out.println(fibb(50));

                    }

}
