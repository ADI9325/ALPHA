package Array;
public class gridWAy {
                    public static int gridWay(int i, int j, int m, int n) {
                                        // base case
                                        if (i == n - 1 && j == m - 1) {
                                                            return 1;
                                        } else if (i == n || j == m) {
                                                            return 0;
                                        }
                                        int w1 = gridWay(i + 1, j, m, n);
                                        int w2 = gridWay(i, j + 1, m, n);
                                        return w1 + w2;

                    }

                    public static void main(String[] args) {
                                        int m = 100, n = 100;
                                        System.out.println(gridWay(0, 0, m, n));

                    }

}
