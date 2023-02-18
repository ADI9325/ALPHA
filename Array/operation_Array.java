package Array;
import java.util.Scanner;

public class operation_Array {
                    public static void update(int marks[]){
                                        for(int i =0 ;i< marks.length;i++){
                                                            marks[i]=marks[i]+1;
                                        }
                    }
                    public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       int marks[] ={ 99,97,98};
                                       update(marks);

                                       //print array
                                       for(int i= 0;i<marks.length;i++){
                                        System.out.println("updated value = " +marks[i]);
                                       }


                    }

}
// import java.util.Scanner;

// public class operation_Array {
//                     public static void main(String[] args) {
//                                        Scanner sc = new Scanner(System.in);
//                                        int marks[]= new int[100];
//                                        System.out.println("The length of array : "+ marks.length);
//                                        marks[1]=100;
//                                        marks[2]=99;
//                                        marks[3]=98;
//                                        System.out.println("phy = "+ marks[1] + " chem = " + marks[2] + " math = " + marks[3]);

//                     }

// }
