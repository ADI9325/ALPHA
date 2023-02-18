package Array;
public class pairs_INarray {
                    public static void Pairs_array(int arr[]){
                                        for(int i=0;i<arr.length;i++){
                                                            for(int j=i+1;j<arr.length;j++){
                                                                                System.out.print("("+arr[i]+","+arr[j]+")");
                                                            }
                                                            System.out.println();
                                        }

                    }


                    public static void main(String[] args) {
                                        int arr[]={1,2,3,4,5};
                                        Pairs_array(arr);

                                        
                    }
                    
}
