// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
// import java.util.*;

// public class average_number {
//                     public static void main(String args[]){
//                                         Scanner sc = new Scanner(System.in);
//                                         System.out.print("Enter three number : ");
//                                         int a = sc.nextInt();
//                                         int b = sc.nextInt();
//                                         int c = sc.nextInt();
//                                         int avg = (a+b+c)/3;
//                                         System.out.print("The average number is : ");
//                                         System.out.println(avg);

//                     }

// }
import java.util.*;

public class average_number {
                    public static void main(String args[]){ 
                                        Scanner sc = new Scanner(System.in);
                                        float pencile = sc.nextFloat();
                                        float pen = sc.nextFloat();
                                        float era = sc.nextFloat();
                                        double total = (pencile + pen + era);
                                        double new_bill = total + total *0.18;
                                        System.out.println(new_bill);

                    

                     }
}






