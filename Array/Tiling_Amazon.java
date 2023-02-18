package Array;
public class Tiling_Amazon {
                    public static int tiling(int n) {
                                        // base case
                                        if (n == 1 || n == 0) {
                                                            return 1;
                                        }
                                        // hzt choice
                                        // int fnm1 = tiling(n - 1);
                                        // vertically
                                        // int fnm2 = tiling(n - 2);
                                        // int totalway = fnm1 +fnm2;
                                        int tot = tiling(n - 2) * tiling(n - 1) + tiling(n - 1);
                                        return tot;
                    }

                    public static void main(String[] args) {
                                        System.out.println(tiling(3));
                    }

}
