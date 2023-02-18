package Array;
public class Diagonal_matrix {
                    public static void diagonal(int matrix[][]) {
                                        int sum=0;
                                        for(int i=0;i<matrix.length;i++){
                                                            for(int j=0;j<matrix[0].length;j++){
                                                                                if(i==j){
                                                                                                    sum=sum+matrix[i][j];
                                                                                }

                                                            }
                                        }
                                        int sum1 =0;
                                        for(int i=0;i<matrix.length;i++){
                                                            for(int j=0;j<matrix[0].length;j++){
                                                                                if(i+j==matrix.length-1){
                                                                                                    sum1=sum1+matrix[i][j];
                                                                                }

                                                            }
                                        }
                                        int totalsum=sum+sum1;
                                        System.out.println("The sum of 1 : "+sum+" + "+sum1+" = "+ totalsum);


                    }

                    public static void main(String[] args) {
                                        int matrix[][] = { { 1, 2, 3, 4 },
                                                           { 5, 6, 7, 8 },
                                                           { 9, 10, 11, 12 },
                                                           { 13, 14, 15, 16 } };
                                                           diagonal(matrix);

                    }

}
