package Array;
public class Search_sortedArray {
                    public static boolean search(int matrix[][],int key){
                                        int col=matrix[0].length-1;
                                        int row=0;
                                        while(col>=0 && row<matrix.length){
                                                            if(key==matrix[row][col]){
                                                                                System.out.println("Key is found : ("+row+"," + col +")");
                                                                                return true;

                                                            }
                                                            else if(key < matrix[row][col]){
                                                                                col--;
                                                            }
                                                            else if(key>matrix[row][col]){
                                                                                row++;
                                                            }
                                        }
                                        return false;

                    }
                    public static void main(String[] args) {
                                        int matrix[][]={{10,20,30,40},
                                                        {15,25,35,48},
                                                        {27,29,37,48},
                                                        {32,33,39,50}};
                                        int key=33;
                                        search(matrix, key);
                    }
                    
}
