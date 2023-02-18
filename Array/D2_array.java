package Array;
import java.util.Scanner;

public class D2_array {
                   public static boolean search(int arr[][],int key){ 
                    for (int i = 0; i < arr.length; i++) {
                                        for (int j = 0; j < arr[0].length; j++) {

                                                            if (key==arr[i][j]){
                                                                                System.out.println("key is found In ("+i+","+j+")");
                                                                                return true;
                                                            }
                                                           
                                        }
                                        
                    }
                    return false;
}

                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        System.out.print("Enter a row size : ");
                                        int n = sc.nextInt();
                                        System.out.print("Enter a column size : ");
                                        int m = sc.nextInt();
                                        System.out.print("Enter a array number : ");
                                        int arr[][] = new int[n][m];
                                        for (int i = 0; i < n; i++) {
                                                            for (int j = 0; j < m; j++) {

                                                                                arr[i][j] = sc.nextInt();
                                                            }
                                        }
                                        System.out.println("2D array Is : ");
                                        for (int i = 0; i < n; i++) {
                                                            for (int j = 0; j < m; j++) {

                                                                                System.out.print(arr[i][j] + " ");
                                                            }
                                                            System.out.println();
                                        }
                                        search(arr, 5);

                    }

}
