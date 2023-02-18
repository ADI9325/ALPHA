package Array;
import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

public class Selection_sort {
                    public static void selectionsort(int arr[]) {
                                        int n = arr.length;
                                        for (int i = 0; i < n; i++) {
                                                            int min = i;
                                                            for (int j = i + 1; j < n; j++) {
                                                                                if (arr[min] < arr[j]) {
                                                                                                    min = j;
                                                                                }
                                                            }
                                                            // swap
                                                            int temp = arr[min];
                                                            arr[min] = arr[i];
                                                            arr[i] = temp;
                                        }
                               for(int i=0;i<n;i++){
                                        System.out.print(arr[i]+" ");
                               }
                    }

                    public static void main(String[] args) {
                                        int arr[] = { 4, 5, 7, 2, 1, 6 };
                                        selectionsort(arr);

                    }

}