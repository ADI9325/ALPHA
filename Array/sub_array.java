package Array;
public class sub_array {
                    public static void sub__array(int arr[]){
                                        int ts=1;
                                        for(int i = 0;i<arr.length-1;i++){
                                                            for(int j =i;j<arr.length;j++){
                                                                                int sum=
                                                                                for(int k=i;k<j;k++){
                                                                                                    System.out.print(arr[k]);
                                                                                                 
                                                                                }
                                                                                ts++;
                                                                                System.out.println();
                                                            }
                                                            System.out.println();
                                        }
                                        System.out.println("Total sub array is : "+ts);

                    }
                    public static void main(String[] args) {
                                  int arr[]={1,2,3,4,5,6,7,8} ;
                                  sub__array(arr);     
                    }
                    
}
