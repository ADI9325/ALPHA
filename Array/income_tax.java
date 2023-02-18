package Array;
import java.util.*;

public class income_tax {
                    public static void main(String args[]){
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("Enter your income : ");
                                       int income = sc.nextInt();
                                       if(0 <=  income &&  income <= 250000){
                                                int tax=0;
                                       }
                                        if(250000 <= income && income <=500000){
                                                            double tax = income + income*0.2;
                                                            System.out.println(tax);
                                        }
                                        if(income >= 1000000){
                                                            double tax = income + income*0.3;
                                                            System.out.println(tax);
                                        }


                    }

}
