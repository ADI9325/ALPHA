package Array;
public class leetcode {
                    public static void add(int nums[]) {
                                        for (int i = 1; i < nums.length; i++) {
                                                            nums[i] = nums[i - 1] + nums[i];
                                                           System.out.println(nums +" ");
                                        }
                    }

                    public static void main(String[] args) {

                                        int nums[] = { 1, 2, 3, 4 };
                                        add(nums);
                    }

}
