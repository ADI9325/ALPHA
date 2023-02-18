package Array;
public class Kadanes_MaxSum {
                    public static void Max_subarray(int a[]) {
                                        int Max_sum = 0;
                                        int currsum = 0;
                                        for (int i = 0; i < a.length; i++) {
                                                            currsum = currsum + a[i];
                                                            if (currsum < 0) {
                                                                                currsum = 0;
                                                            }
                                                            Max_sum=Math.max(currsum, Max_sum);

                                        }

                                        System.out.println("The maximum sum of array is : "+ Max_sum);
                    }

                    public static void main(String[] args) {
                                        int a[] = { 1, 2, -4, 1, 4, 6 };
                                         Max_subarray(a);
                                        
                    }

}
