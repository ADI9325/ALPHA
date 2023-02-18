import java.util.Scanner;

public class bubble_sort {
                    public static void Bubblesort(int arr[]){
                                        int n=arr.length;
                                        for(int i=0;i<n;i++){
                                                            for(int j=i+1;j<n;j++){
                                                                                if(arr[i]<arr[j]){
                                                                                                    int temp=arr[i];
                                                                                                    arr[i]=arr[j];
                                                                                                    arr[j]=temp;
                                                                                }

                                                            }

                                        }
                                        for(int i=0;i<n;i++){
                                                            System.out.println(arr[i]);
                                        }

                    }
                    
                    public static void main(String[] args) {
                                        // Scanner sc = new Scanner(System.in);
                                        // System.out.println("Enter a size of array");
                                        // int n = sc.nextInt();
                                        // int arr[]= new int[n];
                                        // for(int i=0;i<n;i++){
                                        //                     arr[i]=sc.nextInt();
                                        // }
                                        int arr[]={4,5,7,6,1};
                                        Bubblesort(arr);
                    }
                    
}
