package Array;
public class Largest_Noarray {

                    public static int Get_largestNo(int arr[]){
                                        int largest = Integer.MIN_VALUE;
                                        int smallest = Integer.MAX_VALUE;

                                        for(int i = 0;i<arr.length;i++){
                                                            if(largest<arr[i]){
                                                                                largest= arr[i];
                                                            }
                                                            if(smallest>arr[i]){
                                                                                smallest= arr[i];
                                                            }
                                        }
                                        System.out.println("The smallest value is : "+smallest);
                                        return largest;
                    }
                    public static void main(String[] args) {
                                        int arr[]= {11,12,13,14,15,16,171,18,19,20};
                                        System.out.println("This is largest no in array : "+Get_largestNo(arr));

                    }
                    
}
