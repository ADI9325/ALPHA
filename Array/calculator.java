import java.util.Scanner;

public class calculator {
                    public static void main(String args[]){
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println(" Choose option ");
                                        System.out.println("1: Addition");
                                        System.out.println("2: Substration");
                                        System.out.println("3: Multiplication");
                                        System.out.println("4: Division");
                                        

                                        int x = sc.nextInt();
                                        System.out.print("Enter two number : ");
                                        int a = sc.nextInt();
                                        int b = sc.nextInt();

                                        // addition
                                        switch(x){
                                                            case 1 :System.out.println(a+b);
                                                            break;
                                                            case 2: System.out.println(a-b);
                                                            break;
                                                            case 3: System.out.println(a*b);
                                                            break;
                                                            case 4:System.out.println(a/b);
                                                            break;



                                        }





                    }
                    
}
