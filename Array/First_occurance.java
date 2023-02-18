package Array;
public class First_occurance {
                    static int search_key(int arr[],int i,int key){
                                        
                                        if(i<0){
                                                            return -1;
                                        }
                                        if(arr[i]==key){
                                                            return i;
                                        }
                                        return search_key(arr, i-1, key);

                    }
                    public static void main(String[] args) {
                                        int arr[]={1,2,3,5,4,5,3};
                                        int i = arr.length-1;
                                        System.out.println(search_key(arr,i, 5));
                                        
                    }
                    
}
