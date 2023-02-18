public class Buy_Sell_stock {
                    public static int profit(int price[]) {
                                        int n = price.length;
                                        int max_profit = 0;
                                        int buy_price = Integer.MAX_VALUE;

                                        for (int i = 0; i < n; i++) {

                                                            if (buy_price < price[i]) {
                                                                                int profit = price[i] - buy_price;// today
                                                                                max_profit = Math.max(max_profit, profit);// for
                                                                                                                         // everyday
                                                            } else {
                                                                                buy_price = price[i];
                                                                                
                                                            }

                                        }
                                        return max_profit;

                    }

                    public static void main(String[] args) {
                                        int price[] = { 7,1,5,3,6,4 };
                                        System.out.println(profit(price));

                    }
}
