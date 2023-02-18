public class Binary_search {
                    public static int Binary_Search1(int arr[], int key) {
                                        int start = 0;
                                        int end = arr.length - 1;
                                        while (start <= end) {
                                                            int mid = (start + end) / 2;
                                                            if(arr[mid]==key){
                                                                                return mid;
                                                            }
                                                            if(arr[mid]<key){
                                                                                start=mid+1;          
                                                            
                                                            }else{ 
                                                                                end=mid-1;
                                                             }
                                          
                                        }
                                        return -1;
                    }

                    public static void main(String[] args) {
                                        int arr[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
                    
                                        System.out.println("The index position of key is : "+ Binary_Search1(arr, 13));
                                        

                    }

}
