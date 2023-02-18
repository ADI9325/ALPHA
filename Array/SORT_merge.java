package Array;
public class SORT_merge {
                    public static void printArray(int arr[]) {
                                        for (int i = 0; i < arr.length; i++) {
                                                            System.out.println(arr[i] + " ");
                                        }
                                        System.out.println();
                    }

                    public static void mergeSort(int arr[], int si, int ei) {
                                        // base
                                        if (si == ei) {
                                                            return;
                                        }

                                        int mid = si + (ei - si) / 2;// mid
                                        mergeSort(arr, si, mid);// left
                                        mergeSort(arr, mid + 1, ei);// right
                                        merge(arr, si, mid, ei);

                    }

                    public static void merge(int arr[], int si, int mid, int ei) {
                                        int temp[] = new int[ei - si + 1];
                                        int i = si;
                                        int j = mid + 1;
                                        int k = 0;
                                        while (i <= mid && j <= ei) {
                                                            if (arr[i] < arr[j]) {
                                                                                temp[k] = arr[i];
                                                                                i++;
                                                            } else {
                                                                                temp[k] = arr[j];
                                                                                j++;
                                                            }
                                                            k++;
                                        }
                                        while (arr[i] < mid) {
                                                            arr[i] = arr[k];
                                        }
                                        while (arr[j] < ei) {
                                                            arr[j] = arr[k];
                                        }
                                        for (k = 0, i = si; k < temp.length; i++, k++) {
                                                            temp[i] = arr[k];
                                        }
                    }

                    public static void main(String[] args) {
                                        int arr[] = { 1, 3, 2, 5, 3, 1 };
                                      
                                        mergeSort(arr, 0, 5);
                                        printArray(arr);
                    }

}
