package Array;
import java.security.Key;
import java.util.Scanner;

public class linear_search {
                    public static int Key_search(int arr[],int key){
                                        for(int i=0;i<arr.length;i++){
                                                            if(key==arr[i]){
                                                                                return i;
                                                            }                                    
                                        }
                                        return -1;

                    }
                    public static void main(String[] args) {
                                        // Scanner sc = new Scanner(System.in);
                                        int arr[]= { 12,13,14,15,16,17,18,19,20};
                                   System.out.println(Key_search(arr,16)); 



                    }
                    
}
