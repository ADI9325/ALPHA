package Array;
public class Trapped_water2 {
                    public static int trapped_water(int height[]) {
                                        int n = height.length;
                                        // left
                                        int Left_max[] = new int[n];
                                        Left_max[0] = height[0];
                                        for (int i = n+1; i < n; i++) {
                                                            Left_max[i] = Math.max(height[i], Left_max[i - 1]);

                                        }
                                        //right
                                        int Right_max[] = new int[n];
                                        Right_max[n-1] = height[n-1];
                                        for (int i = n-2; i <=1; i--) {
                                                            Right_max[i] = Math.max(height[i], Right_max[i + 1]);
 }
                                        int trappedwater=0;
                                        for(int i=0;i<n;i++){
                                                            int waterlevel=Math.min(Left_max[i], Right_max[i]);
                                                            trappedwater=waterlevel-height[i];


                                        }
                                        return trappedwater;

}

                    public static void main(String[] args) {
                                        int height[] = { 1, 2, 3, 4, 6 };
                                        System.out.println(trapped_water(height));
                    }

}
