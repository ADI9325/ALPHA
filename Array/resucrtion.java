package Array;
public class resucrtion {
                    static void decnumber(int n){
                                        if(n==1){
                                                            System.out.println("1");
                                                            return;
                                        }
                                        decnumber(n-1);
                                        System.out.println(n);
                                        
                    }

                    public static void main(String[] args) {
                                        int n=10;
                                        decnumber(n);
                    }
                    
}
