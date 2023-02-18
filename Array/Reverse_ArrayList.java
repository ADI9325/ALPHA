package Array;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Reverse_ArrayList {
                    public static void swap(ArrayList<Integer> List,int index1 ,int index2){
                                        int temp = List.get(index1);
                                        List.set(index1, List.get(index2));
                                        List.set(index2,temp);
                    }
                    public static void main(String[] args) {
                                        ArrayList<Integer> List = new ArrayList<>();
                                        List.add(1);
                                        List.add(2);
                                        List.add(3);
                                        List.add(4);
                                        List.add(75);
                                        List.add(45);
                                       
                                        int index1 =2;
                                        int index2 =5;

                                        ///find max//////////////////////////
                                        // int max=Integer.MIN_VALUE;
                                        // for(int i=List.size()-1;i>=0;i--){
                                        //                    int a = List.get(i);
                                        //                    max = Math.max(max, a);
                                        // }
                                        // System.out.println(max);


                                        //swap
                                        System.out.println(List);
                                        swap(List, index1, index2);
                                        System.out.println(List);


                    }

                    
}
