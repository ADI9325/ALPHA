public class B_array {
                             // TIME COMPL: O(n);
                    public static void Backtracking_Array(int arr[], int i, int val) {
                                        // base case
                                        if (i == arr.length) {
                                                            printarray(arr);
                                                            return;
                                        }

                                        // recurtion
                                        arr[i] = val;
                                        Backtracking_Array(arr, i + 1, val + 1);
                                        arr[i] = arr[i] - 2;//backtreaking step

                    }

                    public static void printarray(int arr[]) {
                                        for (int i = 0; i < arr.length; i++) {
                                                            System.out.print(arr[i] + " ");
                                        }
                    }

                    public static void main(String[] args) {
                                        int arr[] = new int[5];
                                        Backtracking_Array(arr, 0, 1);
                                        printarray(arr);

                    }

}
