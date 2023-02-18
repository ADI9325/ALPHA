package Array;
public class Oop {
                    public static void main(String[] args) {
                                        JSPM S1 = new JSPM();
                                        S1.Set_name("aditya");
                                        S1.Set_No(05);
                                        System.out.println("The name of student is "+S1.StudentName);
                                        System.out.println("The no of student is "+ S1.StudentNO);

                                        JSPM S2 =new JSPM();
                                        S2.Set_name("abhi");
                                        S2.Set_No(06);
                                        System.out.println("The S2 student name is "+ S2.StudentName);
                                        System.out.println("THe S2 student number is "+S2.StudentNO);

                    }

}

class JSPM {
                    String StudentName;
                    int StudentNO;

                    void Set_name(String newName) {
                                        StudentName = newName;
                    }

                    void Set_No(int newNO) {
                                        StudentNO = newNO;
                    }

}