public class B_find_substing {
                    public static void Find_String(String str,int i, String ans){
                                        //base
                                        if(str.length()==i){
                                                            if(ans.length()==0){
                                                                                System.out.println("NULL");
                                                            }else{
                                                                      System.out.println(ans);          
                                                            }
                                                            
                                                            return;
                                        }

                                        //choice 1
                                        Find_String(str, i+1 ,ans+str.charAt(i));
                                        //choice 2
                                        Find_String(str, i+1, ans);
                    }
                    public static void main(String[] args) {
                                        String str = "abc";
                                       Find_String(str, 0, "");

                    }
                    
}
