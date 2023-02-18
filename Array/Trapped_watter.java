package Array;

public class Trapped_watter {
                    public static int Trapped_water(int height[]) {
                                        int n = height.length;
                                        // right max
                                        int Right_max[] = new int[n];
                                        Right_max[n - 1] = height[n - 1];
                                        for (int i = n - 2; i >= 0; i--) {
                                                            Right_max[i] = Math.max(height[i], Right_max[i + 1]);
                                        }
                                        // left max;
                                        int Left_max[] = new int[n];
                                        Left_max[0] = height[0];
                                        for (int i = 0; i < n; i++) {
                                                            Left_max[i] = Math.max(height[i], Left_max[i - 1]);
                                        }
                                        int Trapped_pani = 0;
                                        for(int i=0;i<n;i++){
                                                            int water_level=Math.min(Left_max[i], Right_max[i]);
                                                            Trapped_pani +=water_level-height[i];

                                        }
                                        return Trapped_pani;

                    }

                    public static void main(String[] args) {
                                        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
                                        Trapped_water(height);
                    }

}
