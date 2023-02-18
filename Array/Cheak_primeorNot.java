// import java.util.Scanner;

// public class Cheak_primeorNot {

//                     public static void Cheak_num(int n){
//                                         if(n%2==0){
//                                                             System.out.println("This is not prime number");
//                                         }
//                                         else{
//                                                             System.out.println("This is prime number ");
//                                         }
//                     }

//                     public static void main(String[] args) {
//                                         Scanner sc = new Scanner(System.in);
//                                         int n = sc.nextInt();
//                                         Cheak_num(n);
//                     }
                    
// }
import java.util.Scanner;

public class Cheak_primeorNot {

                    public static void Cheak_num(int n){
                                      if(n==2){
                                        System.out.println("This is not prime number");
                                       
                                      }
                                      for(int i = 2;i<=n;i++){
                                        if(n%i==0){
                                                            System.out.println(i);
                                        }
                                      }
                                      
                    }

                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        int n = sc.nextInt();
                                        Cheak_num(n);
                    }
                    
}
