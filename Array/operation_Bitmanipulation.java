package Array;
public class operation_Bitmanipulation {
                    public static int getIthbit(int n, int i) {
                                        int bitmask = 1 << i;
                                        if ((n & bitmask) == 0) {
                                                            return 0;
                                        } else {
                                                            return 1;
                                        }
                    }
                    public static int setITHbit(int n,int i){
                                        int bitmask = 1<<i;
                                        return bitmask|n; 
                    }

                    public static void main(String[] args) {
                                        System.out.println(setITHbit(10, 5));

                    }

}
