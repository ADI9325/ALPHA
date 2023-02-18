package Array;
import java.util.Scanner;

public class Sum_naturalNo {
                    public static void main(String args[]){
                                        Scanner sc = new Scanner(System.in);
                                        int n = sc.nextInt();
                                        // int sum = n*(n+1)/2;
                                        int sum = 0;
                                        int i=1;
                                        while(i<=n){
                                                            
                                                            sum=sum+i;
                                                            i++;
                                        }
                                       System.out.println(sum);
                                     

                                        
                    }
                    
}
// Sn = n(n+1)/2