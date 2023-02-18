package Array;
public class Remove_Doublicate {
                    public static void removedoublicate(int i,String str,StringBuilder newstr,boolean map[]){
                                        if(i==str.length()){
                                                            System.out.println(newstr);
                                                            return;
                                        }
                                        //kaam
                                        char currchar = str.charAt(i);
                                        if(map[currchar-'a']==true){
                                                            //doublicate
                                                            removedoublicate(i+1, str, newstr, map);

                                        }else{
                                                            map[currchar-'a']=true;
                                              removedoublicate(i+1, str, newstr.append(currchar), map);             
                                        }
                    }
                    public static void main(String[] args) {
                                        String str = "appnnacollege";
                                        removedoublicate(0, str, new StringBuilder(""), new boolean[26]);
                    }
                    
}
