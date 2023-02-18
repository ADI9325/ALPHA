import java.util.Stack;
//Time complexity is O(n)

public class nextGreaterEle {
                    public static void gearterEle(int arr[], int newArr[]) {
                                        Stack<Integer> s = new Stack<>();
                                        for (int i = arr.length - 1; i >= 0; i--) {
                                                            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                                                                                s.pop();
                                                            }
                                                            if (s.isEmpty()) {
                                                                                newArr[i] = -1;
                                                            } else {
                                                                                newArr[i] = arr[s.peek()];

                                                            }
                                                            s.push(i);
                                        }
                                        for (int i = 0; i < newArr.length; i++) {
                                                            System.out.print(newArr[i] + " ");
                                        }
                    }

                    public static void main(String[] args) {
                                        int arr[] = { 1, 5, 7, 6, 2, 1 };
                                        int newArr[] = new int[arr.length];
                                        gearterEle(arr, newArr);
                    }

}
