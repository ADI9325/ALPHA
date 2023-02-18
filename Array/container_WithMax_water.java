package Array;
public class container_WithMax_water {
                    public static int maxArea(int height[]) {
                                        int first = 0;
                                        int last = height.length - 1;
                                        int max = 0;
                                        
                                        while (first < last) {
                                                            int lh = height[first];
                                                            int rh = height[last];
                                                            int min_height = Math.min(lh,rh);
                                                            int container = (last-first) * min_height;
                                                           
                                                            if (lh < rh) {
                                                                                first++;
                                                            } else {
                                                                                last--;
                                                            }
                                                            max = Math.max(max, container);
                                        }
                                        return max;

                    }



                    public static void main(String[] args) {
                                        int height[]={1,8,6,2,5,4,8,3,7};
                                        System.out.println(maxArea(height));

                    }

}
///welllllllllllllllllllllllllllllllllllllllllllllllllllllllll-------------------------------------------------------------done-----------------------------------------...................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>