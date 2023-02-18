package Array;
public class powerOnN {
                    public static int XPowerN(int x, int n) {
                                        if (n == 0) {
                                                            return 1;
                                        }
                                        return x * XPowerN(x, n - 1);
                    }
                    static  int ObXpowerN(int n ,int x){
                                        if(n==0){
                                                            return 1;
                                        }
                                        int half = ObXpowerN(n/2, x);
                                        int halfpower=half*half;
                                        if(n%2!=0){
                                                            halfpower = x*halfpower;
                                        }
                                        return halfpower;



                    }

                    public static void main(String[] args) {
                                        // System.out.println(XPowerN(100, 10));
                                        System.out.println(ObXpowerN(55, 3));

                    }

}
